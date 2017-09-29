package com.example.xieke.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xieke.coolweather.gson.Weather;

public class MainActivity extends AppCompatActivity {

//    key= 490c0ce82fa446259d8da287ef385e3c
//    http://guolin.tech/api/weather?cityid=CN101010100&key=490c0ce82fa446259d8da287ef385e3c

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (sharedPreferences.getString("weather", null) != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
