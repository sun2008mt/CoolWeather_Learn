package com.wh.sun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("hum")
    public String humidity;

    public String fl;

    public String pcpn;

    public String pres;

    public String vis;

    public Condition condition;

    public Wind wind;
}
