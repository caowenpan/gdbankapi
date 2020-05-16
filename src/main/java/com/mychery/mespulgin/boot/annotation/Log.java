package com.mychery.mespulgin.boot.annotation;

import java.lang.annotation.*;

/**
 * Created by it000289 on 2020/5/7.
 */
@Documented
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Log
{

}
