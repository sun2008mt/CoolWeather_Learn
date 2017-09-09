package com.wh.sun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/9.
 */

public class Suggestion {

    public Air air;

    public Comfortability comf;

    public CarWash cw;

    public DressG drsg;

    public Flu flu;

    public Sport sport;

    public Travel travel;

    public UltravioletRay uv;

    public class Air {

        public String brf;

        @SerializedName("txt")
        public String info;
    }

    public class Comfortability {

        public String brf;

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        public String brf;

        @SerializedName("txt")
        public String info;
    }

    public class DressG {

        public String brf;

        @SerializedName("txt")
        public String info;
    }

    public class Flu {

        public String brf;

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        public String brf;

        @SerializedName("txt")
        public String info;
    }

    public class Travel {

        public String brf;

        @SerializedName("txt")
        public String info;
    }

    //紫外线
    public class UltravioletRay {

        public String brf;

        @SerializedName("txt")
        public String info;
    }
}
