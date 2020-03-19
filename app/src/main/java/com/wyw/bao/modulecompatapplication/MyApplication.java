package com.wyw.bao.modulecompatapplication;

import android.app.Application;

import com.wyw.bao.leancloud.LeanCouldInit;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeanCouldInit.init(this,
                "KTC638B24grGCB2a3ab5Yde2-gzGzoHsz",
                "x8GBvNSPOzmHFvzneFOu5lE8",
                MainActivity.class,"bao1",
                "5e5a0c768a84ab008eb41c2d");

    }
}
