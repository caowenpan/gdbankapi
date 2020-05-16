package com.mychery.mespulgin.boot.service;

import com.mychery.mespulgin.boot.entity.Q058.VehicleLogistics;
import com.mychery.mespulgin.boot.entity.Q059.CertificateInfo;
import com.mychery.mespulgin.boot.timer.MacUtilTimer;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
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

@Service("q059WebService")
public class Q059Service {

            @Autowired
            private MacUtilTimer macUtilTimer;


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
        Q059Service pj = new Q059Service();
       // String content = pj.getbaowen();
        String charset="GBK";

        //byte[] a = pj.post(url, content, charset);
        //String b = new String(a);
       // System.out.println("返回报文："+ b );

 }

      // 根据接收到的参数组装银行所需要业务报文
      public String getbaowen(CertificateInfo certificateInfo){
          String reqXml, reqXmlLength, reqXmlTitle, reqXmlHeader, reqXmlBody, reqXmlMac;

          // ================ 1 定义 Title ======================
          reqXmlTitle = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>";

          // ================ 2 定义 reqXmlHeader ======================
          Document documentHead = DocumentHelper.createDocument();
          Element head = DocumentHelper.createElement("Head");
          documentHead.setRootElement(head);
          Element ChnlNo = head.addElement("ChnlNo");  // 渠道号
          ChnlNo.setText("303");
          Element FTranCode = head.addElement("FTranCode"); // 交易码
          FTranCode.setText("Q058");
          Element InstID = head.addElement("InstID");  // 机构号
          InstID.setText("03030009");
          Element TrmSeqNum = head.addElement("TrmSeqNum");  // 终端流水号
          TrmSeqNum.setText("202003130153598413813722");
          Element TranDateTime = head.addElement("TranDateTime");  // 交易日期时间
          TranDateTime.setText("20200213015359");
          Element ErrCode = head.addElement("ErrCode");  // 错误码
          ErrCode.setText("");
          reqXmlHeader = documentHead.asXML();
          reqXmlHeader = reqXmlHeader.substring(reqXmlHeader.indexOf("<Head>"));

          // ================ 3 定义 reqXmlBody ======================
//          Document documentBody = DocumentHelper.createDocument();
//          Element body = DocumentHelper.createElement("Body");
//          documentBody.setRootElement(body);
//          Element channelCode = body.addElement("CHANNEL_CODE");  // 接入机构号
//          channelCode.setText(vehicleLogistics.getChannelCode());
//          Element dealerCode = body.addElement("DEALER_CODE");  // 经销商代码
//          dealerCode.setText(vehicleLogistics.getDealerCode());
//          Element dealerName = body.addElement("DEALER_NAME");  // 经销商名称
//          dealerName.setText(vehicleLogistics.getDealerName());
//          Element matlingNumber = body.addElement("MAILING_NUMBER");  // 邮寄单号
//          matlingNumber.setText(vehicleLogistics.getMailingNumber());
//          Element expressCompanyName = body.addElement("EXPRESS_COMPANY_NAME");  // 快递公司名称
//          expressCompanyName.setText(vehicleLogistics.getExpressCompanyName());
//          Element matlingNum= body.addElement("MAILING_NUM");  //  邮寄数量
//          matlingNum.setText(vehicleLogistics.getMailingNum());
//          Element matlingTime= body.addElement("MAILING_TIME");  //  邮寄时间
//          matlingTime.setText(vehicleLogistics.getMailingTime());
//
//          for(int i = 0; i < vehicleLogistics.getVehicleLogisticsDetails().size();i++){
//              Element frame = body.addElement("Frame");
//              Element vehicleCode = frame.addElement("VEHICLE_CODE"); // 车架号
//              vehicleCode.setText(vehicleLogistics.getVehicleLogisticsDetails().get(i).getVehicleCode());
//              Element certificate = frame.addElement("CERTIFICATE");   // 合格证号
//              certificate.setText(vehicleLogistics.getVehicleLogisticsDetails().get(i).getCertificate());
//              Element orderNumber = frame.addElement("ORDER_NUMBER");   // 合格证对应的订单号
//              orderNumber.setText(vehicleLogistics.getVehicleLogisticsDetails().get(i).getOrderNumber());
//              Element reserv1 = frame.addElement("RESERVE1");   // 车架号对应物流状态
//              reserv1.setText(vehicleLogistics.getVehicleLogisticsDetails().get(i).getReserve1());
//              Element reserv2 = frame.addElement("RESERVE2");   // 车架号对应物流状态
//              reserv2.setText(vehicleLogistics.getVehicleLogisticsDetails().get(i).getReserve2());
//              Element reserv3 = frame.addElement("RESERVE3");   // 车架号对应物流状态
//              reserv3.setText(vehicleLogistics.getVehicleLogisticsDetails().get(i).getReserve3());
//          }
//          reqXmlBody = documentBody.asXML();
 //         reqXmlBody = reqXmlBody.substring(reqXmlBody.indexOf("<Body>"));
 //         reqXml = reqXmlTitle + "<in>" + reqXmlHeader  + reqXmlBody + "</in>" ;
//          return reqXml ;
          return "";
        }

}