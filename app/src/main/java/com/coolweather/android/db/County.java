package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ACER on 2017/6/19.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县名
    private String weatherId;//县对应的天气id
    private int cityId;//县所属市的Id

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
