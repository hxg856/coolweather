package com.coolweather.model;

/**
 * Created by win10 on 2016/10/18.
 */

public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public String getCountyCode(){
        return countyCode;
    }

    public void setCountyCode(String countyCode){
        this.countyCode = countyCode;
    }

    public int getcityId(){
        return cityId;
    }

    public void setCityId(){
        this.cityId = cityId;
    }
}