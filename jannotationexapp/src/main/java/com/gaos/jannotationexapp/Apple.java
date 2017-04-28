package com.gaos.jannotationexapp;


/**
 * Author:　Created by benjamin
 * DATE :  2017/4/28 11:52
 * versionCode:　1.0.0
 */

public class Apple {
    @FruitName("Apple")
    private String appleName;
    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appColor;
    @FruitProvider(id = 1, name = "栖霞苹果庄园", address = "烟台栖霞")
    private String fruitProvider;

    public String getFruitProvider() {
        return fruitProvider;
    }

    public void setFruitProvider(String fruitProvider) {
        this.fruitProvider = fruitProvider;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppColor() {
        return appColor;
    }

    public void setAppColor(String appColor) {
        this.appColor = appColor;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleName='" + appleName + '\'' +
                ", appColor='" + appColor + '\'' +
                '}';
    }
}
