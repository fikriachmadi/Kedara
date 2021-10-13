package com.dimsen.kedara.data;

import com.google.gson.annotations.SerializedName;

public class Clouds {

    @SerializedName("all")
    private long all;

    public long getAll() {
        return all;
    }

    public void setAll(long all) {
        this.all = all;
    }
}
