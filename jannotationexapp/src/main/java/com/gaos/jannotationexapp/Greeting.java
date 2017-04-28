package com.gaos.jannotationexapp;

import java.lang.annotation.Inherited;

/**
 * Author:　Created by benjamin
 * DATE :  2017/4/28 11:40
 * versionCode:　1.0.0
 */
@Inherited
public @interface Greeting {
    public enum FontColor {BULE, RED, GREEN}

    String name();

    FontColor fontColor() default FontColor.GREEN;

}
