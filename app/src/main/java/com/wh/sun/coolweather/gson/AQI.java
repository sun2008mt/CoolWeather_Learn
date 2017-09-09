package com.wh.sun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String co;

        public String no2;

        public String o3;

        public String so2;

        public String pm10;

        public String pm25;

        @SerializedName("qlty")
        public String quality;
    }
}
