package com.cleanarchitect.networking;

import com.cleanarchitect.models.CityListResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by android on 8/14/2017.
 */

public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();
}
