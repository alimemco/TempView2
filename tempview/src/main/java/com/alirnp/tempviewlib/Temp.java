package com.alirnp.tempviewlib;

import android.content.Context;
import android.widget.Toast;

public class Temp {

    public static void show(Context context , String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
