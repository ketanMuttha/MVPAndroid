package com.mvp.android.environment;


import com.mvp.android.BuildConfig;

public class EnvironmentConfig {

    private static EnvironmentService mEnvironmentService;

    public static EnvironmentService getEnvironmentConfig(){
        if(BuildConfig.DEBUG){
            mEnvironmentService = new WeatherEnvironment();
        } else{
            mEnvironmentService = new WeatherEnvironment();
        }
        return mEnvironmentService;
    }
}
