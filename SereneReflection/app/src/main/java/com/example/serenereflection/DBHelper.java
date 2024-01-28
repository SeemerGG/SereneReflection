package com.example.serenereflection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "meditationDB";
    public static final String TABLE_DAYS = "days";

    public static final String KEY_DATE = "date";
    public static final String KEY_CNT_MED = "count_med";
    public static final String KEY_ALL_TIME = "all_time";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_DAYS + " (" + KEY_DATE + " text primary key,"
                + KEY_CNT_MED + " integer," + KEY_ALL_TIME + " text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_DAYS);
        onCreate(db);
    }
}
