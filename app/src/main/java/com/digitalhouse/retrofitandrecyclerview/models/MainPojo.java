package com.digitalhouse.retrofitandrecyclerview.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainPojo {

    @SerializedName("results")
    private List<Result> resultList;

    public MainPojo(List<Result> resultList) {
        this.resultList = resultList;
    }

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }

    @Override
    public String toString() {
        return "MainPojo{" +
                "resultList=" + resultList+
                '}';
    }
}
