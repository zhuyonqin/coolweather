package com.coolweather.android.db;
import org.litepal.crud.DataSupport;
/**
 * Created by ACER on 2017/6/19.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省名
    private int provinceCode;//省的编号
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }

    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
}
