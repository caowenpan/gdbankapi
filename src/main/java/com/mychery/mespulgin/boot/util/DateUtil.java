package com.mychery.mespulgin.boot.util;

/**
 * Created by IT000289 on 2020/4/23.
 */
public class DateUtil {
    public static String stringToDate(String string){
        String date = string.substring(0,4)+"-"+string.substring(4,6)+"-"+string.substring(6,8);
        //System.out.println(date);
        return date;


    }
}
