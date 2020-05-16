package com.mychery.mespulgin.boot.util;

import cebenc.softenc.SoftEnc;
import com.mychery.mespulgin.boot.controller.InitDataListener;

public class MacUtil {


    //更新密钥文件
    public static void updateWorkKey() {
        //接收到的xml报文
        //例如     000540<?xml version="1.0" encoding="ISO-8859-1"?><out><head><Version>1.0.1</Version><InstId>BJCEB</InstId><AnsTranCode>BJCEBRWKRes</AnsTranCode><TrmSeqNum>admin180207110116</TrmSeqNum></head><tout><partnerCode>746</partnerCode><returnCode>00</returnCode><errorDescription></errorDescription><keyName>ZPK</keyName><keyValue>E5A915D81EB9B8BE816F4E46011B91C4</keyValue><verifyValue>032E5A89CDC16AE2</verifyValue><keyName1>ZAK</keyName1><keyValue1>D13A9DD478ABF1CB633DC4BAE1593CEA</keyValue1><verifyValue1>77F7AF1A9018A7F0</verifyValue1></tout></out>
        //获取报文中的keyValue、verifyValue标签中的值
        String keyValue = InitDataListener.macKeyValue;
        String verifyValue = InitDataListener.macVerifyValue;
        System.out.println("更新密钥文件时的keyValue:"+ keyValue + ",verifyValue:" + verifyValue);

        // 密钥文件目录
        //.0.SYS和.1.SYS为申请的主密钥文件，以下方法会生成.3.SYS，为工作密钥，即计算MAC所使用密钥
        String fileDir = "D:\\cebkey\\";
        System.out.println("密钥文件路径=====["+fileDir+"]");
        try {
            SoftEnc.Init(fileDir);
            //将工作密钥更新到本地密钥文件中
            SoftEnc.WriteMACK(keyValue,verifyValue);
            System.out.println("工作密钥更新成功!!!!");
        } catch (Exception e) {
            System.out.println("工作密钥更新成功!!!!");
            e.printStackTrace();
        }
    }

    //使用MAC密钥对报文计算MAC
    public static String toMAC(String xml) {
        String mac16="";
        try {
            //生成MAC
            mac16 = SoftEnc.GenMac(xml.getBytes("GBK"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mac16;
    }

}
