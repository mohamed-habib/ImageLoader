package com.android.mohamed_habib.imageloaderlibrary;

import android.annotation.SuppressLint;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.util.Pair;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LoaderManager {
    private int BITMAP_QUEUE_CAPACITY = 10;
    private final Queue<Pair<String, Bitmap>> bitmaps = new ConcurrentLinkedQueue<>();
    private String TAG = "ImageLoaderTAG";
    private static LoaderManager ourInstance = null;

    private static LoaderManager getInstance(int maxCapacity) {
        if (ourInstance == null) {
            synchronized (LoaderManager.class) {
                ourInstance = new LoaderManager();
            }
        }
        if (maxCapacity != 0) ourInstance.updateBitmapQueueMaxCapacity(maxCapacity);
        return ourInstance;
    }

    private LoaderManager() {
    }

    private void updateBitmapQueueMaxCapacity(int maxCapacity) {
        BITMAP_QUEUE_CAPACITY = maxCapacity;
    }

    private void loadImage(ImageView imageView, final String url, final DataRetrieved dataRetrieved) {

        //search on the bitmaps map, for the requested url, and if not found then loadImage it.
        for (Pair<String, Bitmap> element : bitmaps) {
            if (element.first != null && element.first.equals(url)) {
                Log.d(TAG, "retrieved: " + element.first);
                dataRetrieved.onSuccess(element.second);
                return;
            }
        }

        ImageRequest imageRequest = new ImageRequest();
        imageRequest.getImage(url, new ImageRequest.RequestListener() {
            @Override
            public void onSuccess(InputStream inputStream) {
                Bitmap bitmap = createBitmap(inputStream);
                cacheBitMap(url, bitmap);
                synchronized (this) {
                    dataRetrieved.onSuccess(bitmap);
                }
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }

    private void cacheBitMap(String url, Bitmap bitmap) {
        if (bitmaps.size() == BITMAP_QUEUE_CAPACITY)
            bitmaps.remove();//remove the first item inserted

        Log.d(TAG, "url: " + url + " bitmaps.size: " + bitmaps.size());
        bitmaps.add(new Pair<>(url, bitmap));
    }

    private Bitmap createBitmap(InputStream inputStream) {
        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
        return Bitmap.createScaledBitmap(bitmap, DEFAULT_IMAGE_WIDTH(), DEFAULT_IMAGE_HEIGHT(), false);
    }

    private int DEFAULT_IMAGE_HEIGHT() {
        return 500;
    }

    private int DEFAULT_IMAGE_WIDTH() {
        return 900;
    }

    public static class Builder {
        private String url;
        private ImageView imageView;
        private int maxCapacity;

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setImageView(ImageView imageView) {
            this.imageView = imageView;
            return this;
        }

        public Builder setMaxCapacity(int maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public void load(final DataRetrieved dataRetrieved) {
            if (url == null) {
                throw new IllegalArgumentException("url must be specified");
            }

            LoaderManager.getInstance(maxCapacity).loadImage(imageView, url, dataRetrieved);
        }
    }

    public interface DataRetrieved {
        void onSuccess(Bitmap bitmap);
    }

}
