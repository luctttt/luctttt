package com.example.activitysample.data.local.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.activitysample.common.Constant;
import com.example.activitysample.data.model.MessageThread;

@Database(entities = MessageThread.class, version = Constant.DB_VERSION)
public abstract class SampleDb extends RoomDatabase {
    public abstract MessageThreadDao getThreadMessageDao();

    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {

        }
    };

    public static final Migration MIGRATION_2_3 = new Migration(2, 3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {

        }
    };
}
