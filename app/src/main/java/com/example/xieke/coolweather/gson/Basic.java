package com.example.xieke.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/26.
 */

public class Basic {

    //我们要解析对应的数据就必须将我们的Basic类的成员属性对应的命名为city,
    // 但是这么命名显然是不科学的，所以就用SerializedName注解，使json里面的字段和java里面的对应起来
    //下面city和cityName就对应起来了
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
