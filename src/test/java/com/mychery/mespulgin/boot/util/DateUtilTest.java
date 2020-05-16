package com.mychery.mespulgin.boot.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IT000289 on 2020/4/23.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class DateUtilTest {

    @Test
    public void testStringToDate() throws Exception {
        System.out.println(DateUtil.stringToDate("20120428282525"));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

    }
}