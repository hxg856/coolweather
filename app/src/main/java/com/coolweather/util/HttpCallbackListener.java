package com.coolweather.util;

/**
 * Created by win10 on 2016/10/18.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
