package com.coolweather.model;

/**
 * Created by win10 on 2016/10/18.
 */

public class Province {
    private int id;
    private String ProvinceName;
    private String ProvinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName){
        this.ProvinceName = ProvinceName;
    }

    public String getProvinceCode(){
        return ProvinceCode;
    }

    public void setProvinceCode(String ProvinceCode){
        this.ProvinceCode = ProvinceCode;
    }
}
