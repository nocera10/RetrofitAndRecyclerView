package com.digitalhouse.retrofitandrecyclerview.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.digitalhouse.retrofit.R;
import com.digitalhouse.retrofitandrecyclerview.models.Result;
import com.digitalhouse.retrofitandrecyclerview.viewHolders.MyViewHolder;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Result> resultList;

    public MyAdapter(List<Result> resultList){
        this.resultList = resultList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int position) {

        String title = resultList.get(position).getTitle();
        int year = resultList.get(position).getYear();

        viewHolder.bind(title, year);
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }
}
