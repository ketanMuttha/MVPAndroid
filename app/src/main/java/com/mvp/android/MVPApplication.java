package com.mvp.android;

import android.app.Application;

import com.mvp.android.dragger.injection.component.DaggerMVPApplicationComponent;
import com.mvp.android.dragger.injection.component.MVPApplicationComponent;
import com.mvp.android.dragger.injection.module.MVPApplicationModule;

import javax.inject.Inject;

/**
 * Created by kmutt on 4/20/18.
 */

public class MVPApplication extends Application {

    private MVPApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        getApplicationComponent().inject(this); // ApplicationComponent injects into "this" client
    }

    public MVPApplicationComponent getApplicationComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerMVPApplicationComponent.builder()
                    .mVPApplicationModule(new MVPApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;
    }
}
