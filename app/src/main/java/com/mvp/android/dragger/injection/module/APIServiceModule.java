package com.mvp.android.dragger.injection.module;



import com.mvp.android.weather.service.WeatherService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;


@Module
public class APIServiceModule {

    @Provides
    @ActivityScope
    public WeatherService provideWeatherController(Retrofit retrofit) {
        return retrofit.create(WeatherService.class);
    }
}
