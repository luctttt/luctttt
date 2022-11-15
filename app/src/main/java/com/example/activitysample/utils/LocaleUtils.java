package com.example.activitysample.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

import com.example.activitysample.common.Constant;

import java.util.Locale;

import timber.log.Timber;


public class LocaleUtils {

    public static void applyLocale(Context context) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String localeString = preferences.getString(Constant.PREF_SETTING_LANGUAGE, Constant.LANGUAGE_EN);
        if (TextUtils.isEmpty(localeString)) {
            localeString = Constant.LANGUAGE_EN;
        }
        Timber.e("applyLocale " + localeString);
        Locale newLocale = new Locale(localeString);

    }

}
