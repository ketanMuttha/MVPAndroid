package com.mvp.android.dragger.injection.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.SyncStateContract;

import com.mvp.android.MVPApplication;
import com.mvp.android.constant.Constant;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ketan on 4/20/18.
 */
@Singleton
@Module
public class MVPApplicationModule {

    private final MVPApplication mApplication;

    private  Context mContext=null;

    public MVPApplicationModule(MVPApplication application) {
        mApplication = application;
        mContext=mApplication.getApplicationContext();
    }

    @Provides
    SharedPreferences provideSharedPreferences() {
        return mApplication.getSharedPreferences(Constant.PREFERENCES_FILE, Context.MODE_PRIVATE);
    }

    @Provides
    Context provideContext(){
        return mContext;
    }

    @Provides
    @Singleton
    protected Application provideApplication() {

        return mApplication;
    }

}
