package com.mvp.android.weather.service;


import com.mvp.android.weather.model.WeatherModel;

import retrofit2.http.GET;
import rx.Observable;

public interface WeatherService {

     @GET("api/location/44418/")
     Observable<WeatherModel> getWeatherData();
}
