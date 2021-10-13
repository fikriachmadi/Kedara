package com.dimsen.kedara.data.api;

import com.dimsen.kedara.data.Weathers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("forecast")
    Call<Weathers> getWeather(
            @Query("q") String q,
            @Query("units") String units,
            @Query("appid") String appid
    );
}
