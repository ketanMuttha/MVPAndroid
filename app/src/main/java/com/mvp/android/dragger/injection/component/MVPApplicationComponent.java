package com.mvp.android.dragger.injection.component;

import android.app.Activity;

import com.mvp.android.MVPApplication;
import com.mvp.android.dragger.injection.module.MVPApplicationModule;
import com.mvp.android.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kmutt on 4/20/18.
 */

@Singleton
@Component(modules = {MVPApplicationModule.class})
public interface MVPApplicationComponent {

    void inject(MVPApplication myApplication);

    void inject(MainActivity activity);
}

