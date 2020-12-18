package com.android.custom.weather.weather.request;

import com.android.custom.weather.weather.model.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by cyc on 18/5/5.
 */

public interface QueryWeatherRequest {
    @GET("data/cityinfo/101210101.html")
    Call<WeatherData> queryWeather();
}
