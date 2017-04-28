package com.gaos.jannotationexapp;

import dagger.Component;

/**
 * Author:　Created by benjamin
 * DATE :  2017/4/28 11:59
 * versionCode:　1.0.0
 */
@Component(modules = AppModule.class)
public interface MyComponent {
    void inject(MainActivity activity);
}
