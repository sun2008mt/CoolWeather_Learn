package com.wh.sun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/9.
 */

public class Wind {

    @SerializedName("deg")
    public String degree;

    @SerializedName("dir")
    public String direction;

    public String sc;             //微风

    @SerializedName("spd")
    public String speed;
}
