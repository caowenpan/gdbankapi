package com.mychery.mespulgin.boot.timer;

import com.alibaba.fastjson.JSONException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


//@Configuration          //证明这个类是一个配置文件
//@EnableScheduling       //打开quartz定时器总开关

@Component
public class MacUtilTimer {

    private String  macKeyValue ;

    private String  macVerifyValue ;

   //@Scheduled(cron = "0 1 0 * * ? ") //每天凌晨00:01:00执行一次
   //@Scheduled(cron = "0 0/2 * * * ? ") //每2分钟执行一次
   public void MacUtilTimer() throws JSONException {
       macKeyValue = "initKey" ;
       macVerifyValue = "initVerify" ;
   }


    /**
     * 根据指定url，编码获得字符串 官网：www.fhadmin.org
     *
     * @param address
     * @param Charset
     * @return
     */
    public static String getStringByConAndCharset(String address, String Charset) {

        StringBuffer sb;
        try {
            URL url = new URL(address);

            URLConnection con = url.openConnection();
            BufferedReader bw = new BufferedReader(new InputStreamReader(con.getInputStream(), Charset));
            String line;
            sb = new StringBuffer();
            while ((line = bw.readLine()) != null) {
                sb.append(line + "\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
            sb = new StringBuffer();
        }
        return sb.toString();
    }

    public String getMacKeyValue() {
        return macKeyValue;
    }

    public void setMacKeyValue(String macKeyValue) {
        this.macKeyValue = macKeyValue;
    }

    public String getMacVerifyValue() {
        return macVerifyValue;
    }

    public void setMacVerifyValue(String macVerifyValue) {
        this.macVerifyValue = macVerifyValue;
    }
}
