package com.example.xieke.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 * 总的实例类来引用gson包里其他各个实体类
 */

public class Weather {

    public Basic basic;

    public String status;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    //daily_forecast包含数组，所以用集合来引用Forecast类
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
