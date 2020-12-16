package com.example.weatherforyou.model.city;

import androidx.annotation.ColorInt;

public interface FavoriteCity {

    String getSomeTime();

    String getCityName();

    String getTemp();

    Double getLat();

    Double getLon();


    int backColor();
}
