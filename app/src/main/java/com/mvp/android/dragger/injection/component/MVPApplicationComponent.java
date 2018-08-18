package com.mvp.android.dragger.injection.component;

import android.app.Activity;

import com.mvp.android.MVPApplication;
import com.mvp.android.dragger.injection.module.APIServiceModule;
import com.mvp.android.dragger.injection.module.ActivityScope;
import com.mvp.android.dragger.injection.module.MVPApplicationModule;
import com.mvp.android.dragger.injection.module.NetworkModule;
import com.mvp.android.view.MainActivity;
import com.mvp.android.view.WeatherActivity;
import com.mvp.android.weather.service.WeatherService;

import javax.inject.Singleton;

import dagger.Component;



@ActivityScope
@Component(modules = {MVPApplicationModule.class, APIServiceModule.class}, dependencies = NetworkComponent.class)
public interface MVPApplicationComponent {

    void inject(MVPApplication myApplication);

    void inject(WeatherActivity activity);

    void inject(WeatherService weatherService);
}

