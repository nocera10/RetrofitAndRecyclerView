package com.digitalhouse.retrofitandrecyclerview.network;

import com.digitalhouse.retrofitandrecyclerview.models.MainPojo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET ("4sblo")
    Call<MainPojo> getAllMovies();
}
