package com.example.anshulgoel.sqlitedb;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     vivz viv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viv= new vivz(this);
        // as in tutorial - when i use getWriteableDatabase, then "oncreate called" toast should be displayed
        // but my app is crashing.
        SQLiteDatabase dbt=viv.getWritableDatabase();

    }


}
