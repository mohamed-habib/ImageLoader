package com.android.mohamed_habib.imageloader;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.mohamed_habib.imageloader.model.JsonData;
import com.android.mohamed_habib.imageloaderlibrary.LoaderManager;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private String TAG = "ImageLoaderTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);

        APICaller apiCaller = new APICaller();
        apiCaller.getData().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<JsonData[]>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(JsonData[] jsonResponse) {

                        final List<String> urls = new ArrayList<>();
                        for (JsonData response : jsonResponse) {
                            urls.add(response.getUrls().getSmall());
                        }
                        recyclerView.setAdapter(new RecyclerViewAdapter(urls, MainActivity.this));
                        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getLocalizedMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }


}
