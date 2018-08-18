package com.mvp.android;

import android.app.Application;

import com.mvp.android.constant.Constant;
import com.mvp.android.dragger.injection.component.DaggerMVPApplicationComponent;
import com.mvp.android.dragger.injection.component.DaggerNetworkComponent;
import com.mvp.android.dragger.injection.component.MVPApplicationComponent;
import com.mvp.android.dragger.injection.component.NetworkComponent;
import com.mvp.android.dragger.injection.module.APIServiceModule;
import com.mvp.android.dragger.injection.module.MVPApplicationModule;
import com.mvp.android.dragger.injection.module.NetworkModule;

import javax.inject.Inject;

/**
 * Created by kmutt on 4/20/18.
 */

public class MVPApplication extends Application {

    private  MVPApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        getApplicationComponent();
        super.onCreate();
    }

    public  MVPApplicationComponent getApplicationComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerMVPApplicationComponent.builder()
                    .networkComponent( getNetworkComponent())
                    .build();
        }
        return mApplicationComponent;
    }

    public NetworkComponent getNetworkComponent() {
        return DaggerNetworkComponent.builder()
                .networkModule(new NetworkModule(Constant.BASE_URL))
                .build();
    }
}
