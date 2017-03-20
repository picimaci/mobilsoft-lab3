package com.example.picimaci.mobilsoft_lab3;

import android.app.Application;

import com.example.picimaci.mobilsoft_lab3.ui.UIModule;

/**
 * Created by mobsoft on 2017. 03. 20..
 */

public class MobSoftApplication extends Application {

    public static MobSoftApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerMobSoftApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }
}