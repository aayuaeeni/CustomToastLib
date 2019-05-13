package com.ld.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ld.customtoast.CustomToster;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomToster customToster = new CustomToster();
//        customToster.showCustomToast();
    }
}
