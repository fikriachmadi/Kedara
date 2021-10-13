package com.dimsen.kedara.data;

import com.google.gson.annotations.SerializedName;

public class Sys {

    @SerializedName("pod")
    private Pod pod;

    public Pod getPod() {
        return pod;
    }

    public void setPod(Pod pod) {
        this.pod = pod;
    }
}
