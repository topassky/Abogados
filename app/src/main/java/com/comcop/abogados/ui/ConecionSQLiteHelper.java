package com.comcop.abogados.ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.ciclista_actual.utilities.Utilities;

public class ConecionSQLiteHelper extends SQLiteOpenHelper {

    public ConecionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilities.createTable0);
        db.execSQL(Utilities.createTable2);
        db.execSQL(Utilities.createTable1);
        db.execSQL(Utilities.createTable3);
        System.out.println("\n\n\n\n\nCreadas las tablas");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS  "+Utilities.tblmuestra);
        db.execSQL("DROP TABLE IF EXISTS  "+Utilities.tblVentanas);
        db.execSQL("DROP TABLE IF EXISTS  "+Utilities.tblConfiguracion);
        db.execSQL("DROP TABLE IF EXISTS  "+Utilities.tblTour);
        onCreate(db);
    }
}