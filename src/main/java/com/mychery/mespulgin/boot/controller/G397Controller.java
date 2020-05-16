package com.mychery.mespulgin.boot.controller;

import com.mychery.mespulgin.boot.clientg397.OZEAIIMPCCCMAGDResponse;
import com.mychery.mespulgin.boot.clientg397.SZEAIIMPCCCMAGDSoap_SZEAIIMPCCCMAGDSoap1_Client;
import com.mychery.mespulgin.boot.entity.Body2;
import com.mychery.mespulgin.boot.entity.Head;
import com.mychery.mespulgin.boot.entity.Out;
import com.mychery.mespulgin.boot.entity.g397gdyh.In;
import com.mychery.mespulgin.boot.util.MacUtil;
import com.mychery.mespulgin.boot.util.Xmlutils;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.text.DecimalFormat;


@RestController
@RequestMapping("/qzjServer")

public class G397Controller {

//    static int socketTimeout = 30000;// 请求超时时间
//    static int connectTimeout = 30000;// 传输超时时间

    @Autowired
    private SZEAIIMPCCCMAGDSoap_SZEAIIMPCCCMAGDSoap1_Client client;

    // static Logger logger = Logger.getLogger(G397Controller.class);


    //g397接口
    @PostMapping(value="/g397Api",produces="application/xml;charset=GBK")
    public String g397(@RequestBody String requestBody, HttpServletResponse response) throws JSONException, JAXBException {

        System.out.println("============= macKeyValue:" + InitDataListener.macKeyValue);

        System.out.println("============= macVerifyValue:" + InitDataListener.macVerifyValue);


        System.out.println( "**********更新密钥***开始**********");
        MacUtil.updateWorkKey();
        System.out.println( "**********更新密钥***结束**********");


        String resultXmlNew = "";
        int beginIndex = requestBody.indexOf('<');
        int endIndex = requestBody.lastIndexOf('>');
        String xml = requestBody.substring(beginIndex, endIndex + 1);
        System.out.println(xml);
        Out out = new Out();
        Head head = new Head();
        Body2 body2 = new Body2();
        In in = (In) Xmlutils.xmlToObject(In.class, xml);
        System.out.println("in: " + in.toString());
        String resultXml = "";

        try {
            OZEAIIMPCCCMAGDResponse ozeaiimpcccmagdResponse = null;
            ozeaiimpcccmagdResponse = client.getResponseG397byIn(in);
            // Boolean flag  = false;

            OZEAIIMPCCCMAGDResponse.ZEAIIMPCCCMAGDResponse zeaiimpcccmagdResponse = null;

            if (ozeaiimpcccmagdResponse != null &&
                    ozeaiimpcccmagdResponse.getZEAIIMPCCCMAGDResponse() != null) {
                zeaiimpcccmagdResponse = ozeaiimpcccmagdResponse.getZEAIIMPCCCMAGDResponse();
                if (zeaiimpcccmagdResponse.getRESULTFLAG() != null) {
                    head = in.getHead();
                    head.setTranDateTime(zeaiimpcccmagdResponse.getESCOMMON().getTIMEEND());
                    out.setHead(head);

                    body2.setRESULT_FLAG(zeaiimpcccmagdResponse.getRESULTFLAG());
                    body2.setMSG(zeaiimpcccmagdResponse.getMSG());
                    out.setBody2(body2);
                    resultXml = Xmlutils.convertToXml(out);
                    resultXmlNew = resultXml.replaceAll("standalone=\"yes\"", "")
                            .replaceAll("encoding=\"UTF-8\"", "encoding=\"ISO-8859-1\"").replace(" ?", "?");
                    System.out.println("处理前报文:"+resultXmlNew);

                }

            } else {
                head = in.getHead();
                head.setErrCode("0");
                out.setHead(head);
                body2.setErrorCode("ERR000");
                body2.setErrorInfo("未获取SAP返回值");
                out.setBody2(body2);
                resultXml = Xmlutils.convertToXml(out);
                resultXmlNew = resultXml.replaceAll("standalone=\"yes\"", "")
                        .replaceAll("encoding=\"UTF-8\"", "encoding=\"ISO-8859-1\"").replace(" ?", "?");
                System.out.println("处理前报文:"+resultXmlNew);

            }

        } catch (Exception e) {
            head = in.getHead();
            head.setErrCode("0");
            out.setHead(head);
            body2.setErrorCode("ERR000");
            body2.setErrorInfo(e.getMessage());
            out.setBody2(body2);
            resultXml = Xmlutils.convertToXml(out);
            resultXmlNew = resultXml.replaceAll("standalone=\"yes\"", "")
                    .replaceAll("encoding=\"UTF-8\"", "encoding=\"ISO-8859-1\"").replace(" ?", "?");
            System.out.println("处理前报文:"+resultXmlNew);

        }finally {
            System.out.println( "**********计算MAC***开始**********");
            String mac16 = MacUtil.toMAC(resultXmlNew);
            System.out.println("生成MAC："+mac16);

            DecimalFormat g1 = new DecimalFormat("000000");
            String xmlLength = g1.format(Integer.valueOf(resultXmlNew.length()));
            resultXmlNew = xmlLength + resultXmlNew + mac16 ;

            System.out.println("处理后报文："+ resultXmlNew );
            return resultXmlNew;

        }

    }

}


