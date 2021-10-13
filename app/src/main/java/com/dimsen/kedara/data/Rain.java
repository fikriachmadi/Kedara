package com.dimsen.kedara.data;

import com.google.gson.annotations.SerializedName;

public class Rain {

    @SerializedName("3h")
    private double the3H;

    public double getThe3H() {
        return the3H;
    }

    public void setThe3H(double the3H) {
        this.the3H = the3H;
    }
}
