package com.wh.sun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/9.
 */

public class ForecastHourly {

    public String date;

    @SerializedName("hum")
    public String humidity;

    public String pop;

    public String pres;

    public String tmp;

    public Condition condition;

    public Wind wind;
}
