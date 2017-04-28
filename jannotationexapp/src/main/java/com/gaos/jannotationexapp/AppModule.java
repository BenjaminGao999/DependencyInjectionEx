package com.gaos.jannotationexapp;

import dagger.Module;
import dagger.Provides;

/**
 * Author:　Created by benjamin
 * DATE :  2017/4/28 12:05
 * versionCode:　1.0.0
 */
@Module
public class AppModule {

    @Provides
    public Apple provideApple() {
        return new Apple();
    }
}
