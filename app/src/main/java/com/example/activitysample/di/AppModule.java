package com.example.activitysample.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import androidx.room.Room;

import com.example.activitysample.common.Constant;
import com.example.activitysample.data.local.db.SampleDb;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    public SharedPreferences provideSharedPreference(Application context) {
        return PreferenceManager.getDefaultSharedPreferences(context);

    }

    @Provides
    @Singleton
    public SampleDb provideRoomDb(Application context) {
        return Room.databaseBuilder(context, SampleDb.class, Constant.DB_NAME)
                .fallbackToDestructiveMigration()
                .addMigrations(SampleDb.MIGRATION_1_2).build();
    }

}
