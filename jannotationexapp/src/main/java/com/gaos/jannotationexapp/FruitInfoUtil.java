package com.gaos.jannotationexapp;

import java.lang.reflect.Field;

/**
 * Author:　Created by benjamin
 * DATE :  2017/4/28 15:17
 * versionCode:　1.0.0
 */

public class FruitInfoUtil {

    private static FruitInfoUtil fruitInfoUtil;
    String strFruitName = " 水果名称：";
    String strFruitColor = " 水果颜色：";
    String strFruitProvicer = "供应商信息：";
    private Class clazz;

    public static FruitInfoUtil getInstance() {
        if (fruitInfoUtil == null) {

            fruitInfoUtil = new FruitInfoUtil();
        }
        return fruitInfoUtil;
    }

    public FruitInfoUtil setFruitClazz(Class clazz) {
        this.clazz = clazz;
        return fruitInfoUtil;
    }


    public void initFields() {

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = (FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer = " 供应商编号：" + fruitProvider.id() + " 供应商名称：" + fruitProvider.name() + " 供应商地址：" + fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }

    private static final String TAG = "FruitInfoUtil";

    @Override
    public String toString() {
        return "FruitInfoUtil{" +
                "strFruitName='" + strFruitName + '\'' +
                ", strFruitColor='" + strFruitColor + '\'' +
                ", strFruitProvicer='" + strFruitProvicer + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
