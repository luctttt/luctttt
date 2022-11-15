package com.example.activitysample.ui.main.home;

import com.example.activitysample.data.repository.SmsRepository;
import com.example.activitysample.data.repository.WeatherRepository;
import com.example.activitysample.ui.base.BaseViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class HomeViewModel extends BaseViewModel {

    public SmsRepository smsRepository;
    public WeatherRepository weatherRepository;

    @Inject
    public HomeViewModel(SmsRepository smsRepository, WeatherRepository weatherRepository) {
        this.smsRepository = smsRepository;
        this.weatherRepository = weatherRepository;
    }


}