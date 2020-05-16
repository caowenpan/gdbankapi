package com.mychery.mespulgin.boot.wsImpl;

import com.mychery.mespulgin.boot.entity.Q058.VehicleLogistics;
import com.mychery.mespulgin.boot.entity.Q059.CertificateInfo;
import com.mychery.mespulgin.boot.service.Q058Service;
import com.mychery.mespulgin.boot.service.Q059Service;
import com.mychery.mespulgin.boot.util.MacUtil;
import com.mychery.mespulgin.boot.wsInterface.Q059WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;

@WebService(endpointInterface = "com.mychery.mespulgin.boot.wsInterface.Q059WebService",
        targetNamespace = "http://service.testbank.mychery.com/wsdl",serviceName = "Q059Service" ,portName = "dao")
@Component
public class Q059WebServiceIMplementation implements Q059WebService {

    @Autowired
    private Q059Service q059WebService;

    @Override
    public String sendReqest(CertificateInfo certificateInfo){

       String busXml = q059WebService.getbaowen(certificateInfo);

        System.out.println( "**********更新密钥***开始**********");
        MacUtil.updateWorkKey();
        System.out.println( "**********更新密钥***结束**********");

        System.out.println( "**********计算MAC***开始**********");
        String mac16 = MacUtil.toMAC(busXml);
        System.out.println("生成MAC："+mac16);

        DecimalFormat g1 = new DecimalFormat("000000");
        String xmlLength = g1.format(Integer.valueOf(busXml.length()));
        String reqXml = xmlLength + busXml + mac16 ;

        System.out.println("请求报文："+ reqXml );
        String url = "https://111.205.51.133:3031";
        String charset="GBK";

        byte[] a = new byte[0];
        try {
            a = q059WebService.post(url, reqXml, charset);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String b = null;
        try {
            b = new String(a,"GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("返回报文："+ b );
        return "返回报文："+ b  ;
    }
}