package com.mvp.android.dragger.injection.component;

import com.mvp.android.dragger.injection.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;


@Singleton
@Component(modules = NetworkModule.class)
public interface NetworkComponent {

    Retrofit retrofit();
}
