package com.android.mohamed_habib.imageloader;

import com.android.mohamed_habib.imageloader.model.JsonData;
import com.android.mohamed_habib.imageloader.model.JsonResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface JSONFileAPIService {
    @GET("wgkJgazE")
    Observable<JsonData[]> getData();
}
