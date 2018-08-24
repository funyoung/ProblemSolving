package com.funyoung.problemsolving;

import android.app.Application;

import com.frogermcs.androiddevmetrics.AndroidDevMetrics;

public class ProblemSolvingApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        super.onCreate();
        if (BuildConfig.DEBUG) {
//            Timber.plant(new Timber.DebugTree());
            AndroidDevMetrics.initWith(this);
        }

//        initAppComponent();
    }
}
