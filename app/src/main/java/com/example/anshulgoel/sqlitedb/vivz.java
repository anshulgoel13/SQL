package com.example.anshulgoel.sqlitedb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class vivz extends SQLiteOpenHelper {
    private  static  final String DATABASE_NAME="dbt";
    private static final String TABLE_NAME="dbttable";
    private static final int DATABASE_VERSION=1;
    private static final String UID="_id";
    private static final String NAME="name";
    private String CREATE_TABLE ="CREATE TABLE "+TABLE_NAME+"("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+" " +
            "VARCHAR(255));";
    private Context context;
    private static final String DROP_TABLE="DROP TABLE"+TABLE_NAME+"IF EXISTS";
    SQLiteDatabase dbt;
    public vivz(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Message.message(context,"constructor called");
    }


    @Override
    public void onCreate(SQLiteDatabase dbt) {

       dbt.execSQL(CREATE_TABLE);

        Message.message(context,"oncreate called");
    }
    @Override
    public void onUpgrade(SQLiteDatabase dbt, int i, int i1) {
       dbt.execSQL(DROP_TABLE);
    }
}
