
package com.mychery.mespulgin.boot.clientq058;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-04-17T14:21:41.062+08:00
 * Generated source version: 3.3.5
 *
 */
public final class Q058WebService_Dao_Client {

    private static final QName SERVICE_NAME = new QName("http://service.testbank.mychery.com/wsdl", "Q058Service");

    private Q058WebService_Dao_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = Q058Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        Q058Service ss = new Q058Service(wsdlURL, SERVICE_NAME);
        Q058WebService port = ss.getDao();


        System.out.println("Invoking sendReqest...");
            VehicleLogistics vehicleLogistics = new VehicleLogistics();

            vehicleLogistics.setChannelCode("03030009");
            vehicleLogistics.setDealerCode("H290123233");
            vehicleLogistics.setDealerName("广州风日汽车销售有限公司");
            vehicleLogistics.setExpressCompanyName("盐城华意汽车销售服务有限公司");
            vehicleLogistics.setMailingNum("1");
            vehicleLogistics.setMailingTime("20190829132323");
            vehicleLogistics.setMailingNumber("1514854869");

            VehicleLogisticsDetail vehicleLogisticsDetail = new VehicleLogisticsDetail();
            vehicleLogisticsDetail.setCertificate("WAW001018000894");
            vehicleLogisticsDetail.setOrderNumber("402976695899");
            vehicleLogisticsDetail.setReserve1("1");
            vehicleLogisticsDetail.setReserve2(new String());
            vehicleLogisticsDetail.setReserve3(new String());
            vehicleLogisticsDetail.setVehicleCode("LZWCAAGA0JC111742");

          /*  VehicleLogisticsDetail vehicleLogisticsDetail1 = new VehicleLogisticsDetail();
            vehicleLogisticsDetail1.setCertificate("HGZH001");
            vehicleLogisticsDetail1.setOrderNumber("402976695899");
            vehicleLogisticsDetail1.setReserve1("1");
            vehicleLogisticsDetail1.setReserve2(new String());
            vehicleLogisticsDetail1.setReserve3(new String());
            vehicleLogisticsDetail1.setVehicleCode("DPHG001");

            VehicleLogisticsDetail vehicleLogisticsDetail2 = new VehicleLogisticsDetail();
            vehicleLogisticsDetail2.setCertificate("HGZH002");
            vehicleLogisticsDetail2.setOrderNumber("402976695899");
            vehicleLogisticsDetail2.setReserve1("1");
            vehicleLogisticsDetail2.setReserve2(new String());
            vehicleLogisticsDetail2.setReserve3(new String());
            vehicleLogisticsDetail2.setVehicleCode("HGZH002");

            VehicleLogisticsDetail vehicleLogisticsDetail3 = new VehicleLogisticsDetail();
            vehicleLogisticsDetail3.setCertificate("HGZH003");
            vehicleLogisticsDetail3.setOrderNumber("402976695899");
            vehicleLogisticsDetail3.setReserve1("1");
            vehicleLogisticsDetail3.setReserve2(new String());
            vehicleLogisticsDetail3.setReserve3(new String());
            vehicleLogisticsDetail3.setVehicleCode("DPHG003");


            VehicleLogisticsDetail vehicleLogisticsDetail4 = new VehicleLogisticsDetail();
            vehicleLogisticsDetail4.setCertificate("HGZH004");
            vehicleLogisticsDetail4.setOrderNumber("402976695899");
            vehicleLogisticsDetail4.setReserve1("1");
            vehicleLogisticsDetail4.setReserve2(new String());
            vehicleLogisticsDetail4.setReserve3(new String());
            vehicleLogisticsDetail4.setVehicleCode("DPHG004");*/

            List<VehicleLogisticsDetail> vehicleLogisticsDetailList = new ArrayList<VehicleLogisticsDetail>();
            vehicleLogisticsDetailList.add(vehicleLogisticsDetail);
            /*vehicleLogisticsDetailList.add(vehicleLogisticsDetail1);
            vehicleLogisticsDetailList.add(vehicleLogisticsDetail2);
            vehicleLogisticsDetailList.add(vehicleLogisticsDetail3);
            vehicleLogisticsDetailList.add(vehicleLogisticsDetail4);*/

            vehicleLogistics.vehicleLogisticsDetails = vehicleLogisticsDetailList;
            System.out.println(vehicleLogistics);

        com.mychery.mespulgin.boot.clientq058.VehicleLogistics _sendReqest_arg0 =vehicleLogistics;

        com.mychery.mespulgin.boot.clientq058.ResponseResult _sendReqest__return = port.sendReqest(_sendReqest_arg0);
        System.out.println("sendReqest.result=" + _sendReqest__return.toString());




        System.exit(0);
    }

}
