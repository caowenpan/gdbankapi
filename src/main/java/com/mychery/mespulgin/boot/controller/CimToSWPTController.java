package com.mychery.mespulgin.boot.controller;

import com.mychery.mespulgin.boot.clientg397.SZEAIIMPCCCMAGDSoap_SZEAIIMPCCCMAGDSoap1_Client;
import com.mychery.mespulgin.boot.entity.g397gdyh.In;
import com.mychery.mespulgin.boot.util.Xmlutils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.nio.charset.Charset;



@RestController
@RequestMapping("/qzjServer")
public class CimToSWPTController {

    static int socketTimeout = 30000;// 请求超时时间
    static int connectTimeout = 30000;// 传输超时时间

    @Autowired
    private  SZEAIIMPCCCMAGDSoap_SZEAIIMPCCCMAGDSoap1_Client client;

     static Logger logger = Logger.getLogger(CimToSWPTController.class);


    //新能源电池销售接口
    @PostMapping("/TestBankEAIApi")
    public String createSale(@RequestBody String requestBody, HttpServletResponse response) throws JSONException, JAXBException {

        System.out.println("============= macKeyValue:"+InitDataListener.macKeyValue);

        System.out.println("============= macVerifyValue:"+InitDataListener.macVerifyValue);

       System.out.println(requestBody.getClass().getName());

        int beginIndex = requestBody.indexOf('<');
        int endIndex = requestBody.lastIndexOf('>');

        String xml = requestBody.substring(beginIndex,endIndex+1);
        System.out.println(xml);
        In in = (In) Xmlutils.xmlToObject(In.class,xml);
        System.out.println("in: "+in.toString());







       /* String soapXml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:schemas-iwaysoftware-com:iwse\" xmlns:urn1=\"urn:iwaysoftware:ibse:jul2003:Z_EAI_IMP_CARSTATUS_KF\">"
                + "<soapenv:Header>"
                + "   <tns:ServiceInfo xmlns:tns=\"http://www.bps.com.cn/OSB/xsd/common/serviceInfo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.bps.com.cn/OSB/xsd/common/ serviceInfo Header_ServiceInfo.xsd\">"
                + "     <tns:user_id>22</tns:user_id>"
                + "     <tns:password>e10adc3949ba59abbe56e057f20f883e</tns:password>"
                + "     <tns:service_id>EBS_KFERP_B_800</tns:service_id>"
                + "     <tns:operation>调用</tns:operation>"
                + "     <tns:instance_id></tns:instance_id>"
                + "     <tns:systemCode>09E1;09S1</tns:systemCode>"
                + "     <tns:expand1></tns:expand1>"
                + "     <tns:expand2></tns:expand2>"
                + "   </tns:ServiceInfo>"
                + "  </soapenv:Header>"
                + "<soapenv:Body>"
                + "  <urn1:Z_EAI_IMP_CARSTATUS_KF>"
                + "    <urn1:Z_EAI_IMP_CARSTATUS>"
                + "     <urn1:T_ITEM>";*/
/*        for(CarStatus carStatus:carStatusList){
            soapXml = soapXml + "<urn1:item>";
            soapXml = soapXml + "<urn1:ZVINR>"+ carStatus.getZvinr()+"</urn1:ZVINR>";
            soapXml = soapXml + "<urn1:UDATE>"+ carStatus.getUDATE()+"</urn1:UDATE>";
            soapXml = soapXml + "<urn1:UTIME>"+ carStatus.getUTIME()+"</urn1:UTIME>";
            soapXml = soapXml + "<urn1:VKBUR>"+ carStatus.getVKBUR()+"</urn1:VKBUR>";
            soapXml = soapXml + "<urn1:WERKS>"+ carStatus.getWERKS()+"</urn1:WERKS>";
            soapXml = soapXml + "<urn1:LGORT>"+ carStatus.getLGORT()+"</urn1:LGORT>";
            soapXml = soapXml + "<urn1:FLAG>"+ carStatus.getFLAG()+"</urn1:FLAG>";
            soapXml = soapXml + "        </urn1:item>";

        }*/
      /*  soapXml = soapXml + "        <urn1:item>"
                + "        <urn1:ZVINR>LVVDB12A5DD990702</urn1:ZVINR>"
                + "        <urn1:UDATE>2014-04-30</urn1:UDATE>"
                + "        <urn1:UTIME>10:11:44</urn1:UTIME>"
                + "        <urn1:VKBUR>XS1</urn1:VKBUR>"
                + "        <urn1:WERKS>1008</urn1:WERKS>"
                + "        <urn1:LGORT>V101</urn1:LGORT>"
                + "        <urn1:FLAG>X</urn1:FLAG>"
                + "        </urn1:item>";*/
       /* soapXml = soapXml + "      </urn1:T_ITEM>";
        soapXml = soapXml
               *//* +" <urn1:T_PROPERTY>"
                + "<urn1:item>"
                + " <urn1:NAME>LINE_IT_ITEM</urn1:NAME>"
                + "  <urn1:VALUE>1</urn1:VALUE>"
                + "   </urn1:item>"
                + "  </urn1:T_PROPERTY>"*//*
                + "   </urn1:Z_EAI_IMP_CARSTATUS>"
                + " </urn1:Z_EAI_IMP_CARSTATUS_KF>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";

        String postUrl = "http://10.1.3.178:6001/OSB_MNGT/Proxy/DynamicProxy";
        System.out.println("请求报文："+ soapXml);
        String result = doPostSoap1_1(postUrl, soapXml, "");
        return result;*/




        String result = client.getResponseG397byIn(in).toString();

        return result;




    }


    /*public static String Json2List(String data) throws JSONException {
        String items = "";
        if (data.equals("")) {
            return items;
        }
        JSONArray array = new JSONArray(data);
        JSONObject object = null;
        Map<String,String> item = null;
        for (int i = 0; i < array.length(); i++) {
            object = array.getJSONObject(i);
            String id = object.getString("id");
            String message = object.getString("message");
            System.out.println("id-->"+id);
            if(i==array.length()-1){
                items= items+id+":"+message;
            }else{
                items= items + id+":"+message + ",";
            }
        }
        return items;
    }*/


    /*public static HttpResponse send(String url, Object data, String token, String key){
        try{
            Map<String, Object> requestMap = new HashMap<String, Object>();
            String requestMsg = new JsonSerializer().deep(true).serialize(data);
            System.out.println("requestMsg----->"+requestMsg);
            String enStr = encrypt(requestMsg, key);
            requestMap.put("requestMsg", enStr);
            requestMap.put("timestamp", System.currentTimeMillis());
            String sign = byteArrayToHexString(encryptHMAC(enStr.getBytes(), key));
            requestMap.put("sign", sign);
            HttpResponse response = getRequest(url, token, requestMap).send().unzip().unzip();
            return response;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/

    /*public static Map parsToMap( HttpResponse response,String key){
        Map<String,String> resultMap = new HashMap<String,String>();
        try {
            ObjectMapper mapper = new ObjectMapper();
            Map map = mapper.readValue(response.body(), Map.class);
            String result="";
            if(isNotEmpty(map.get("data"))){
                result = decrypt(map.get("data").toString(), key);
            }else {
                System.out.println("(map.get(\"msg\")"+map.get("msg"));
                result = decrypt(map.get("msg").toString(), key);
            }
            resultMap.put("code",map.get("code").toString());
            resultMap.put("message",result);
            return resultMap;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/

    /*public static String encrypt(String content, String password) {
        try {
            if(StringUtils.isEmpty(content)) {
                return "";
            }
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(password.getBytes());
            kgen.init(128, secureRandom);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            BASE64Encoder coder = new BASE64Encoder();
            coder.encode(enCodeFormat);
            Cipher cipher = Cipher.getInstance("AES");
            byte[] byteContent = content.getBytes("utf-8");
            cipher.init(1, key);
            byte[] result = cipher.doFinal(byteContent);
            String str = Base64.encode(result);
            return str;
        } catch (NoSuchAlgorithmException var13) {
            ;
        } catch (NoSuchPaddingException var14) {
            ;
        } catch (InvalidKeyException var15) {
            ;
        } catch (UnsupportedEncodingException var16) {
            ;
        } catch (IllegalBlockSizeException var17) {
            ;
        } catch (BadPaddingException var18) {
            ;
        }
        return null;
    }*/

   /* public static boolean isNotEmpty(Object o) {
        if (o == null) {
            return false;
        }
        if ("".equals(FilterNull(o.toString()))) {
            return false;
        } else {
            return true;
        }
    }*/

   /* public static String FilterNull(Object o) {
        return o != null && !"null".equals(o.toString()) ? o.toString().trim() : "" ;
    }*/

    /*public static String decrypt(String str, String password) {
        try{
            byte[] content = Base64.decode(str);
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(password.getBytes());
            kgen.init(128, secureRandom);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, key);
            byte[] result = cipher.doFinal(content);
            return new String(result, "UTF-8");
        } catch (NoSuchAlgorithmException var10) {

        } catch (NoSuchPaddingException var11) {

        } catch (InvalidKeyException var12) {

        } catch (IllegalBlockSizeException var13) {

        } catch (BadPaddingException var14) {

        } catch (Exception var15) {

        }
        return "";
    }*/

   /* public static byte[] encryptHMAC(byte[] data, String key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), "HmacMD5");
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.init(secretKey);
        return mac.doFinal(data);
    }*/

    /*public static String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        byte[] var2 = bytes;
        int var3 = bytes.length;
        for(int var4 = 0; var4 < var3; ++var4) {
            byte aByte = var2[var4];
            int v = aByte & 255;
            if(v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString();
    }*/

    /*public static HttpRequest getRequest(String url, String accessToken, Map<String, Object> params) {
        HttpRequest request = HttpRequest.post(url);
        request.header("Authorization", "Bearer " + accessToken);
        request.header("Content-Type", "application/json; charset=utf-8");
        request.acceptEncoding("gzip");
        request.body((new JsonSerializer()).serialize(params));
        return request;
    }*/

   /* public static boolean isNull4Id(String data) throws JSONException {
        JSONArray array = new JSONArray(data);
        JSONObject object = null;
        for (int i = 0; i < array.length(); i++) {
            object = array.getJSONObject(i);
            String id = object.getString("id");
            if(id==null||id==""||id=="null"){
                return true;
            }
        }
        return false;
    }*/

    /**
     * 使用SOAP1.1发送消息
     *
     * @param postUrl
     * @param soapXml
     * @param soapAction
     * @return
     */
    public static String doPostSoap1_1(String postUrl, String soapXml,
                                       String soapAction) {
        String retStr = "";
        // 创建HttpClientBuilder
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        // HttpClient
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        HttpPost httpPost = new HttpPost(postUrl);
        //  设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom()
                .setSocketTimeout(socketTimeout)
                .setConnectTimeout(connectTimeout).build();
        httpPost.setConfig(requestConfig);
        try {
            httpPost.setHeader("Content-Type", "text/xml;charset=UTF-8");
            httpPost.setHeader("SOAPAction", soapAction);
            StringEntity data = new StringEntity(soapXml, Charset.forName("UTF-8"));
            httpPost.setEntity(data);
            CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            if (httpEntity != null) {
                // 打印响应内容
                retStr = EntityUtils.toString(httpEntity, "UTF-8");
                logger.info("response:" + retStr);
                System.out.println("返回报文: "+retStr);
            }
            // 释放资源
            closeableHttpClient.close();
        } catch (Exception e) {
            logger.error("exception in doPostSoap1_1", e);
        }
        return retStr;
    }
}
