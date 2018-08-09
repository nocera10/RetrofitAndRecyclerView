package com.digitalhouse.retrofitandrecyclerview.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.digitalhouse.retrofit.R;
import com.digitalhouse.retrofitandrecyclerview.adapters.MyAdapter;
import com.digitalhouse.retrofitandrecyclerview.models.MainPojo;
import com.digitalhouse.retrofitandrecyclerview.models.Result;
import com.digitalhouse.retrofitandrecyclerview.network.GetDataService;
import com.digitalhouse.retrofitandrecyclerview.network.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);

        Call<MainPojo> call = service.getAllMovies();

        call.enqueue(new Callback<MainPojo>() {

            @Override
            public void onResponse(Call<MainPojo> call, Response<MainPojo> response) {
                progressDialog.dismiss();
                List<Result> resultList;
                resultList = convertToResultList(response);
                generateDataList(resultList);
                Toast.makeText(MainActivity.this, "Fucking right indian boy", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<MainPojo> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*Method to generate List of data using RecyclerView with MyAdapter*/
    private void generateDataList(List<Result> resultList) {
        recyclerView = findViewById(R.id.recyclerViewId);
        myAdapter = new MyAdapter(resultList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);
    }

    private List<Result> convertToResultList(Response<MainPojo> response) {
        MainPojo mainPojo = response.body();
        return mainPojo.getResultList();
    }
}
