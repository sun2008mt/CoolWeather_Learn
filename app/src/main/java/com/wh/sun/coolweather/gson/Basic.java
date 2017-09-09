package com.wh.sun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/9.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("cnty")
    public String countryName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("lat")
    public String latitude;

    @SerializedName("lon")
    public String longitude;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

        //UTC: Coordinated Universal Time，协调世界时
        @SerializedName("utc")
        public String updateTimeUTC;
    }
}
