package com.mvp.android.dragger.injection.component;

import com.mvp.android.dragger.injection.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * @author Filippo Engidashet <filippo.eng@gmail.com>
 * @version 1.0.0
 * @since 3/19/2016
 */
@Singleton
@Component(modules = NetworkModule.class)
public interface NetworkComponent {

    Retrofit retrofit();
}
