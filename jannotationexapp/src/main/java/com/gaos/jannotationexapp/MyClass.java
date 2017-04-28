package com.gaos.jannotationexapp;

import android.support.annotation.NonNull;

/**
 * Author:　Created by benjamin
 * DATE :  2017/4/28 15:04
 * versionCode:　1.0.0
 */

public class MyClass {
    private String name;

    public MyClass(@NonNull String name) {
        this.name = name;
    }
}
