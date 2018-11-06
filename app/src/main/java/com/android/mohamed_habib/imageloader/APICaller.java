package com.android.mohamed_habib.imageloader;

import com.android.mohamed_habib.imageloader.model.JsonData;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class APICaller {
    private Retrofit retrofit;
    private static final String BASE_URL = "http://pastebin.com/raw/";

    APICaller() {
        retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }


    public Observable<JsonData[]> getData() {
        return retrofit.create(JSONFileAPIService.class).getData();
    }
}
