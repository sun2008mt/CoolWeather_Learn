package com.wh.sun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/9.
 */

public class ForecastDaily {

    public String date;

    @SerializedName("hum")
    public String humidity;

    public String pcpn;

    public String pop;

    public String pres;

    public String uv;

    public String vis;

    public Temperature tmp;

    public Wind wind;

    public Astro astro;

    @SerializedName("cond")
    public Condition condition;

    public class Temperature {

        public String max;

        public String min;
    }

    public class Astro {

        public String mr;

        public String ms;

        public String sr;

        public String ss;
    }

    public class Condition {

        public String code_d;

        public String code_n;

        public String txt_d;

        public String txt_n;
    }
}
