package com.mychery.mespulgin.boot.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by it000289 on 2020/5/7.
 */
@Aspect
@Component
public class ControllerAspect {
   private  static final Logger log= LoggerFactory.getLogger(ControllerAspect.class);

    //@Pointcut("@annotation(com.mychery.mespulgin.boot.annotation.Log)")
    @Pointcut("execution(public * com.mychery.mespulgin.boot.controller..*(..))")
    public void logPointcut(){}

    @Around("logPointcut()")
    public Object logHandler(ProceedingJoinPoint process) throws Throwable{
        long startTime=System.currentTimeMillis();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String beginTime=df.format(new Date());// new Date()为获取当前系统时间

        MethodSignature methodSignature= (MethodSignature) process.getSignature();
        Method method=methodSignature.getMethod();
        String methodName=method.getName();
        String className= method.getDeclaringClass().getName();
        Object[] args=process.getArgs();
        StringBuilder params=new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            params.append(args[i].toString());
            params.append(";");
        }
        Object result= null;
        try {
            result = process.proceed();
        } catch (Throwable throwable) {
            String exception=throwable.getClass()+":"+throwable.getMessage();
            long costTime=System.currentTimeMillis()-startTime;
            log.error("请求时间：{}，请求耗时：{}，请求类名：{}，请求方法：{}，请求参数:{}，请求结果：{}",beginTime,costTime,className,methodName,params.toString(),exception);
            return (throwable.getMessage());
        }
        long costTime=System.currentTimeMillis()-startTime;
        log.info("请求时间：{}，请求耗时：{}，请求类名：{}，请求方法：{}，请求参数:{}，请求结果：{}",beginTime,costTime,className,methodName,params.toString(), result);
        return result;
    }


}
