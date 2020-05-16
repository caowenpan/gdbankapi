package com.mychery.mespulgin.boot.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by IT000141 on 2018/8/20.
 */
public class ApplicationContextUtil implements ApplicationContextAware {


    private static  ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }


    public void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    public  static  Object getBean(String beanName){
        return  applicationContext.getBean(beanName);
    }
}
