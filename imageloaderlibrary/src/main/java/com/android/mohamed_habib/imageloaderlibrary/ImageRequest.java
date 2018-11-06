package com.android.mohamed_habib.imageloaderlibrary;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

class ImageRequest {
    void getImage(String url, RequestListener requestListener) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                requestListener.onFailure(e);
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull final Response response) {
                if (!response.isSuccessful() || response.body() == null) {
                    requestListener.onFailure(new IOException("Unexpected code " + response));
                } else {
                    requestListener.onSuccess(response.body().byteStream());
                }
            }
        });

    }


    public interface RequestListener {
        void onSuccess(InputStream inputStream);

        void onFailure(Exception e);
    }
}
