package com.mychery.mespulgin.boot.controller;

import com.alibaba.fastjson.JSONException;
import com.mychery.mespulgin.boot.service.Bank9000Service;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;


//@Configuration          //证明这个类是一个配置文件
//@EnableScheduling       //打开quartz定时器总开关

@Component
@Configuration
@EnableScheduling
public class InitDataListener implements InitializingBean, ServletContextAware {

    @Resource
    private Bank9000Service bank9000Service;

    public static String  macKeyValue ;

    public static String  macVerifyValue ;

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override

    public void setServletContext(ServletContext servletContext) {
//        macKeyValue = "initKey" ;
//        macVerifyValue = "initVerify" ;
        try {
            HashMap map = bank9000Service.requestKeyVerify();
            if( map!= null){
                this.setMacKeyValue((String)map.get("macKeyValue"));
                this.setMacVerifyValue((String)map.get("macVerifyValue"));
            }
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 1 0 * * ? ") //每天凌晨00:01:00执行一次
    public void MacUtilTimer() throws JSONException {
        try {
            System.out.println( new Date() + " 开始定时请求9000接口！");
            HashMap map = bank9000Service.requestKeyVerify();

            if( map!= null){
                this.setMacKeyValue((String)map.get("macKeyValue"));
                this.setMacVerifyValue((String)map.get("macVerifyValue"));
                System.out.println( new Date() + " 请求9000接口成功！");
            }else{
                System.out.println( new Date() + " 请求9000接口失败！");
            }
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
