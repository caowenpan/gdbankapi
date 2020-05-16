package com.mychery.mespulgin.boot.timer;

import com.alibaba.fastjson.JSONException;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by IT000141 on 2018/8/17.
 */
@Configuration          //证明这个类是一个配置文件
//@EnableScheduling       //打开quartz定时器总开关
public class VIMToSWPTTimer {

  //  @Scheduled(cron = "0 0,15,30 8,20 * * ?")
  //@Scheduled(cron = "0 0/2 * * * ? ") //每2分钟执行一次
   public void timer() throws JSONException {
        String result = getStringByConAndCharset("http://localhost:8090/cim/createSale","UTF-8");
        System.out.println("新能源VIM定时器成功--->"+result);
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

}
