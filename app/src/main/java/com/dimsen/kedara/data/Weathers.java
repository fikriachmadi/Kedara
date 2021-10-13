package com.dimsen.kedara.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weathers {
    @SerializedName("cod")
    private String cod;

    @SerializedName("message")
    private long message;

    @SerializedName("cnt")
    private long cnt;

    @SerializedName("list")
    private List<Lists> list;

    @SerializedName("city")
    private City city;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public long getMessage() {
        return message;
    }

    public void setMessage(long message) {
        this.message = message;
    }

    public long getCnt() {
        return cnt;
    }

    public void setCnt(long cnt) {
        this.cnt = cnt;
    }

    public List<Lists> getList() {
        return list;
    }

    public void setList(List<Lists> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
