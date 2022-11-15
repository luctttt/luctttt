package com.example.activitysample.data.local;

import android.content.SharedPreferences;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class SharedPreferenceHelper {
    public static SharedPreferences sharedPreferences;
    @Inject
    public SharedPreferenceHelper(SharedPreferences sharedPreferences) {
        SharedPreferenceHelper.sharedPreferences = sharedPreferences;
    }

}
