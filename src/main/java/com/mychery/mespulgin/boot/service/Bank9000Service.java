package com.mychery.mespulgin.boot.service;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import javax.net.ssl.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


@Service("Bank9000Service")
public class Bank9000Service {


           private static class TrustAnyTrustManager implements X509TrustManager {
          //该方法检查客户端的证书，若不信任该证书则抛出异常。由于我们不需要对客户端进行认证，因此我们只需要执行默认的信任管理器的这个方法。//JSSE中，默认的信任管理器类为TrustManager。
           public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

           }
           //该方法检查服务器的证书，若不信任该证书同样抛出异常。通过自己实现该方法，可以使之信任我们指定的任何证书。在实现该方法时，也可以简单的不做任何处理，即一个空的函数体，由于不会抛出异常，它就会信任任何证书。
            public void checkServerTrusted(X509Certificate[] chain, String authType)throws CertificateException {

            }
            //返回受信任的X509证书数组。
            public X509Certificate[] getAcceptedIssuers() {
               return new X509Certificate[] {}; }
           }

            private static class TrustAnyHostnameVerifier implements HostnameVerifier {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            }



             /** 
          * post方式请求服务器(https协议) 
          *  
          * @param url 
          *            请求地址 
          * @param content 
          *            参数 
          * @param charset 
          *            编码 
          * @return 
          * @throws NoSuchAlgorithmException 
          * @throws KeyManagementException 
          * @throws IOException 
          */
            public  byte[] post(String url, String content, String charset) throws NoSuchAlgorithmException, KeyManagementException, IOException {
             /*类HttpsURLConnection似乎并没有提供方法设置信任管理器。其实，HttpsURLConnection通过SSLSocket来建立与HTTPS的安全连接，SSLSocket对象是由SSLSocketFactory生成的。
                * HttpsURLConnection提供了方法setSSLSocketFactory(SSLSocketFactory)设置它使用的SSLSocketFactory对象。
                * SSLSocketFactory通过SSLContext对象来获得，在初始化SSLContext对象时，可指定信任管理器对象。
                * */
                SSLContext sc = SSLContext.getInstance("SSL");
                sc.init(null, new TrustManager[] { new TrustAnyTrustManager() }, new java.security.SecureRandom());

                URL console = new URL(url);
                HttpsURLConnection conn = (HttpsURLConnection) console.openConnection();
                conn.setSSLSocketFactory(sc.getSocketFactory());
                conn.setHostnameVerifier(new TrustAnyHostnameVerifier());
                conn.setDoOutput(true);
                //设置请求头
                conn.setRequestProperty("Content-Type", "application/json;charset=GBK");
                conn.connect();
                DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                out.write(content.getBytes(charset));
                // 刷新、关闭  
                out.flush();
                out.close();
                InputStream is = conn.getInputStream();
                if (is != null) {
                    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len = is.read(buffer)) != -1) {
                        outStream.write(buffer, 0, len);
                    }
                 is.close();
                 return outStream.toByteArray();
                }
                return null;
            }

    public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, IOException{
        String url = "https://111.205.51.133:3031";
        Bank9000Service pj = new Bank9000Service();
        String content = pj.getbaowen();
        String charset="GBK";

        byte[] a = pj.post(url, content, charset);
        String b = new String(a);
        System.out.println("返回报文："+ b );

    }

    public HashMap requestKeyVerify() throws KeyManagementException, NoSuchAlgorithmException, IOException{
        HashMap keyVerifyMap = new HashMap();
        String url = "https://111.205.51.133:3031";
        Bank9000Service pj = new Bank9000Service();
        String content = pj.getbaowen();
        String charset="GBK";

        byte[] a = pj.post(url, content, charset);
        String b = new String(a);
        System.out.println("返回报文："+ b );
        String xml = b.substring(b.indexOf("<Out>"));

        //1.创建Reader对象
        SAXReader reader = new SAXReader();
        //2.加载xml
        try {
           // Document document = reader.read(new File(xml));
            Document document = DocumentHelper.parseText(xml);
            //3.获取根节点
            Element rootElement = document.getRootElement();
            Iterator iterator = rootElement.elementIterator();
            while (iterator.hasNext()){
                Element stu = (Element) iterator.next();
                List<Attribute> attributes = stu.attributes();
                System.out.println("======获取属性值======");
                for (Attribute attribute : attributes) {
                    System.out.println(attribute.getValue());
                }
                System.out.println("======遍历子节点======");
                Iterator iterator1 = stu.elementIterator();
                while (iterator1.hasNext()){
                    Element stuChild = (Element) iterator1.next();
                    if("macKeyValue".equals(stuChild.getName())){
                        keyVerifyMap.put("macKeyValue",stuChild.getStringValue());
                    }
                    if("macVerifyValue".equals(stuChild.getName())){
                        keyVerifyMap.put("macVerifyValue",stuChild.getStringValue());
                    }
                    System.out.println("节点名："+stuChild.getName()+"---节点值："+stuChild.getStringValue());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return keyVerifyMap;
    }
 //构造嵌套的JSON报文方式，即在new一个JSONObject,并返回报文字符串
      public String getbaowen(){
            JSONObject test= new JSONObject();
            String query = new String();
          try {
              test.put("xxxx", "");
              String resp= null;
              JSONObject obj = new JSONObject();
              obj.put("xxxxxx", "");
              obj.put("test", test);
              query = obj.toString();
              query = "000299<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?><In><Head><ChnlNo>303</ChnlNo><FTranCode>9000</FTranCode><InstID>03030009</InstID><TrnSeqNum>202003130153598413813722</TrnSeqNum><TranDateTime>20200213015359</TranDateTime><ErrCode></ErrCode></Head><Body><operationDate>20200313</operationDate></Body></In>";
              System.out.println("9000请求报文：" + query );
          } catch (JSONException e) {
              e.printStackTrace();
          }finally {
              return query;
          }
        }

}