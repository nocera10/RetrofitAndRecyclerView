package com.digitalhouse.retrofitandrecyclerview.models;

import com.google.gson.annotations.SerializedName;

public class Id {

    @SerializedName("trakt")
    private int trakt;
    @SerializedName("slug")
    private String slug;
    @SerializedName("imdb")
    private String imdb;
    @SerializedName("tmbd")
    private int tmbd;


    public Id(int trakt, String slug, String imdb, int tmdb) {
        this.trakt = trakt;
        this.slug = slug;
        this.imdb = imdb;
        this.tmbd = tmdb;
    }

    public int getTrakt() {
        return trakt;
    }

    public void setTrakt(int trakt) {
        this.trakt = trakt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public int getTmbd() {
        return tmbd;
    }

    public void setTmbd(int tmbd) {
        this.tmbd = tmbd;
    }
}
