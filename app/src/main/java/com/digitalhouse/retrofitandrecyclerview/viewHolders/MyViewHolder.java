package com.digitalhouse.retrofitandrecyclerview.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.digitalhouse.retrofit.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public final View myView;

    private TextView textTitle;
    private TextView textYear;

    public MyViewHolder(View itemView) {
        super(itemView);
        myView = itemView;

        textTitle = myView.findViewById(R.id.movieTitleId);
        textYear = myView.findViewById(R.id.movieYearId);
    }

    public void bind(String s1, int s2) {
        textTitle.setText(s1);
        textYear.setText(Integer.toString(s2));
    }
}
