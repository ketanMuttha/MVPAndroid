package com.mvp.android.dragger.injection.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by kmutt on 5/20/18.
 */

@Singleton
@Module
public class NetworkModule {

    private String mBaseUri;

    public NetworkModule(String uri){
        mBaseUri=uri;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(){

        return new Retrofit.Builder()
                .baseUrl(mBaseUri)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

    }
}
