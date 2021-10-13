package com.dimsen.kedara.data;

import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("temp")
    private double temperature;

    @SerializedName("feels_like")
    private double feels_like;

    @SerializedName("temp_min")
    private double temperature_min;

    @SerializedName("temp_max")
    private double temperature_max;

    @SerializedName("pressure")
    private long pressure;

    @SerializedName("sea_level")
    private long sea_level;

    @SerializedName("grnd_level")
    private long grnd_level;

    @SerializedName("humidity")
    private long humidity;

    @SerializedName("temp_kf")
    private double temperature_kf;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public double getTemperature_min() {
        return temperature_min;
    }

    public void setTemperature_min(double temperature_min) {
        this.temperature_min = temperature_min;
    }

    public double getTemperature_max() {
        return temperature_max;
    }

    public void setTemperature_max(double temperature_max) {
        this.temperature_max = temperature_max;
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    public long getSea_level() {
        return sea_level;
    }

    public void setSea_level(long sea_level) {
        this.sea_level = sea_level;
    }

    public long getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(long grnd_level) {
        this.grnd_level = grnd_level;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public double getTemperature_kf() {
        return temperature_kf;
    }

    public void setTemperature_kf(double temperature_kf) {
        this.temperature_kf = temperature_kf;
    }
}
