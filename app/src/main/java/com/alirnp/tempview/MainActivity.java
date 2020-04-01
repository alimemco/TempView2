package com.alirnp.tempview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alirnp.tempviewlib.Temp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Temp.show(this,"sample text");
    }
}
