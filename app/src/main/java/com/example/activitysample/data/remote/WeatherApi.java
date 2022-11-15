package com.example.activitysample.data.remote;


import com.example.activitysample.data.model.Location;
import com.example.activitysample.data.model.Weather;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface WeatherApi {
    @GET("locations/v1/cities/search")
    Single<List<Location>> getLocation(
            @Query("apikey") String Api_key,
            @Query("q" ) String city
    );

    @GET("currentconditions/v1/258955")
    Single<List<Weather>> getWeather(
            @Query("locationKey") String locationKey,
            @Query("apikey") String Api_key);


}

