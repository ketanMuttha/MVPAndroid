package com.mvp.android.view.presenter;

import com.mvp.android.view.viewInterface.WeatherViewInterface;

/**
 * Created by kmutt on 5/20/18.
 */

public interface WeatherViewPresenterInterface {

    void attach(WeatherViewInterface t);

    void dettach();

    void makeWeatheRequest();
}
