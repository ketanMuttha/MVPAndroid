package com.mvp.android.view.viewInterface;

import com.mvp.android.weather.model.WeatherModel;
import com.mvp.android.weather.service.WeatherService;

/**
 * Created by kmutt on 5/20/18.
 */

public interface WeatherViewInterface {

    void updateUI(WeatherModel weatherModel);

    WeatherService getWeatherService();
}
