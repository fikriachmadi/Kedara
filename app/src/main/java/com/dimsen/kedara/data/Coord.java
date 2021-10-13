package com.dimsen.kedara.data;

import com.google.gson.annotations.SerializedName;

public class Coord {

    @SerializedName("lat")
    private double latitude;

    @SerializedName("lon")
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
