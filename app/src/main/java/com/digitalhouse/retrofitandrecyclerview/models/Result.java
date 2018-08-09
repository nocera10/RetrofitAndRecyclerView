package com.digitalhouse.retrofitandrecyclerview.models;

import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("title")
    private String title;
    @SerializedName("year")
    private int year;
    @SerializedName("ids")
    private Id ids;

    public Result(String title, int year, Id id) {
        this.title = title;
        this.year = year;
        this.ids = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Id getId() {
        return ids;
    }

    public void setId(Id id) {
        this.ids = id;
    }
}
