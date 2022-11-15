package com.example.activitysample;

import android.content.res.Configuration;

import androidx.annotation.NonNull;
import androidx.multidex.MultiDexApplication;

import com.example.activitysample.utils.LocaleUtils;

import dagger.hilt.android.HiltAndroidApp;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import timber.log.Timber;


@HiltAndroidApp
public class App extends MultiDexApplication {
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        RxJavaPlugins.setErrorHandler(Timber::w);
        initLog();
        initRealm();
    }

    private void initRealm() {
//        Realm.init(this);
//        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
//                .name(Constant.DATABASE_NAME)
//                .migration(new RealmMessageMigration())
//                .compactOnLaunch()
//                .build();
//        Realm.setDefaultConfiguration(realmConfiguration);
    }

    public static App getInstance() {
        return instance;
    }

    private void initLog() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

    }

//    @Override
//    protected void attachBaseContext(Context newBase) {
//        LocaleUtils.applyLocale(newBase);
//        super.attachBaseContext(newBase);
//    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LocaleUtils.applyLocale(this);
    }
}
