package com.gaos.jannotationexapp;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author:　Created by benjamin
 * DATE :  2017/4/28 13:57
 * versionCode:　1.0.0
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
    int id() default -1;

    String name() default "";

    String address() default "";
}
