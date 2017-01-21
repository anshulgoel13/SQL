package com.example.anshulgoel.sqlitedb;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by anshul goel on 1/21/2017.
 */

public class Message {
    public static void message (Context context,String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
