package com.example.viikko9;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class DegreeListHolder extends RecyclerView.ViewHolder {

    TextView degree;


    public DegreeListHolder(View itemView) {
        super(itemView);
        degree = itemView.findViewById(R.id.tvDegree);
    }
}