package com.gaos.jannotationexapp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Author:　Created by benjamin
 * DATE :  2017/4/28 11:26
 * versionCode:　1.0.0
 */
@Target(ElementType.TYPE)
public @interface Table {
    /**
     * 数据表名称注解，默认值为类名称
     * @return
     */
    public String tableName() default "className";
}

