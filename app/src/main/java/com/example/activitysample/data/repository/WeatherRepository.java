package com.example.activitysample.data.repository;

import com.example.activitysample.data.model.Weather;
import com.example.activitysample.data.remote.WeatherApi;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class WeatherRepository {
    WeatherApi weatherApi;

    @Inject
    public WeatherRepository(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }

    public Single<List<Weather>> getWeather(String locationKey, String apiKey) {
        return weatherApi.getWeather(locationKey, apiKey);
    }
}
