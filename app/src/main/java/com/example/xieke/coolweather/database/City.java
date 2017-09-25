package com.example.xieke.coolweather.database;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/25.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;//城市名字

    private int cityCode;//城市代码

    private int provinceId;//当前市所属省

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
