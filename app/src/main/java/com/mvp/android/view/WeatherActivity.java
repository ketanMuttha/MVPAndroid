package com.mvp.android.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mvp.android.MVPApplication;
import com.mvp.android.R;
import com.mvp.android.view.presenter.WeatherViewPresenter;
import com.mvp.android.view.presenter.WeatherViewPresenterInterface;
import com.mvp.android.view.viewInterface.WeatherViewInterface;
import com.mvp.android.weather.model.WeatherModel;
import com.mvp.android.weather.service.WeatherService;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


public class WeatherActivity extends AppCompatActivity implements WeatherViewInterface {

    @Inject
    protected WeatherService mWeatherService;

    WeatherViewPresenterInterface mPresenter;

    @BindView(R.id.weatherInfo)
    protected TextView mWeatherInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MVPApplication) getApplication())
                .getApplicationComponent()
                .inject(WeatherActivity.this);

        setContentView(R.layout.weather_info);
        ButterKnife.bind(this);


        mPresenter = new WeatherViewPresenter();
        mPresenter.attach(this);

        mPresenter.makeWeatheRequest();
    }


    @Override
    public void updateUI(WeatherModel weatherModel) {
        if (weatherModel != null) {
            mWeatherInfo.setText(weatherModel.getmTitle() + " Weather Information");
            WeatherModel.Consolidated_weather[] Weatherinfo = weatherModel.getConsolidated_weather();
            if (Weatherinfo.length > 0) {
                mWeatherInfo.setText(mWeatherInfo.getText()+"\n Temperature : " + Weatherinfo[0].getMax_temp());
                mWeatherInfo.setText(mWeatherInfo.getText()+"\n Forecast : " + Weatherinfo[0].getWeather_state_name());
            }
        }

    }

    @Override
    public WeatherService getWeatherService() {

        return mWeatherService;
    }
}
