package com.mvp.android.view.presenter;

import android.util.Log;

import com.mvp.android.view.viewInterface.WeatherViewInterface;
import com.mvp.android.weather.model.WeatherModel;

import java.util.List;

import rx.Observer;


/**
 * Created by kmutt on 5/20/18.
 */

public class WeatherViewPresenter extends BasePresenter implements WeatherViewPresenterInterface{

    private WeatherViewInterface view;




    @Override
    public void attach(WeatherViewInterface view) {
        this.view=view;
        configureSubscription();
    }


    @Override
    public void dettach() {
        view=null;
    }

    @Override
    public void makeWeatheRequest() {

        subscribe( view.getWeatherService().getWeatherData(),getObserver());

    }


    public Observer<WeatherModel> getObserver(){

        return new Observer<WeatherModel>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e("","exception"+e.getMessage());
            }

            @Override
            public void onNext(WeatherModel weatherModels) {
                Log.e("","Success");
                view.updateUI(weatherModels);
            }
        };
    }


}
