package com.code.pali.mysunshine;

/**
 * Created by Jazz on 11/11/2017.
 */

public class Weather {
    private int weatherimg;
    private String weatherData;
    private String weatheDesc;
    private String weathertmper;





    public Weather(int weatherimg, String weatherData, String weatheDesc, String weathertmper) {
        this.weatherimg = weatherimg;
        this.weatherData = weatherData;
        this.weatheDesc = weatheDesc;
        this.weathertmper = weathertmper;
    }


    public int getWeatherimg() {
        return weatherimg;
    }

    public String getWeatherData() {
        return weatherData;
    }

    public String getWeatheDesc() {
        return weatheDesc;
    }

    public String getWeathertmper() {
        return weathertmper;
    }
}
