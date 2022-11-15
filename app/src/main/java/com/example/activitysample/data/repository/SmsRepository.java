package com.example.activitysample.data.repository;

import com.example.activitysample.data.remote.WeatherApi;

import javax.inject.Inject;

public class SmsRepository {
    WeatherApi weatherApi;

    @Inject
    public SmsRepository(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }
}
