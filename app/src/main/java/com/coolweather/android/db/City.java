package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ACER on 2017/6/19.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//城市名
    private int cityCode;//市的代号
    private int provinceId;//市所属省的id

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
