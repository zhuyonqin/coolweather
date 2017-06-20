package com.coolweather.android.util;

import android.text.TextUtils;

import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ACER on 2017/6/19.
 */

public class Utility {
    //解析和处理服务器返回的省级数据
    public static boolean handleProvinceaResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject province0bject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(province0bject.getString("name"));
                    province.setProvinceCode(province0bject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    //解析和处理服务器返回的市级数据
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    //解析处理服务器返回的县级数据
public static boolean handleCountyResponse(String response,int cityId){
    if (!TextUtils.isEmpty(response)){
        try{
            JSONArray allCounties=new JSONArray(response);
            for (int i=0;i<allCounties.length();i++){
                JSONObject countyObject=allCounties.getJSONObject(i);
                County county=new County();
                county.setCountyName(countyObject.getString("name"));
                county.setWeatherId(countyObject.getString("weather_id"));
                county.setCityId(cityId);
                county.save();
            }
            return true;
        }catch (JSONException e){
            e.printStackTrace();
        }
    }
    return false;
    }
}


