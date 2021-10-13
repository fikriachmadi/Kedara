package com.dimsen.kedara.data;

import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("id")
    private long weather_id;

    @SerializedName("main")
    private MainEnum main;

    @SerializedName("description")
    private Description description;

    @SerializedName("icon")
    private Icon icon;

    public long getWeather_id() {
        return weather_id;
    }

    public void setWeather_id(long weather_id) {
        this.weather_id = weather_id;
    }

    public MainEnum getMain() {
        return main;
    }

    public void setMain(MainEnum main) {
        this.main = main;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
