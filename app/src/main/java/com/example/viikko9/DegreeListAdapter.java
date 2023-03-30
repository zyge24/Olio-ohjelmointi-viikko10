package com.example.viikko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DegreeListAdapter extends RecyclerView.Adapter<DegreeListHolder> {
    private Context context;
    private ArrayList<String> degreeList = new ArrayList<>();

    public DegreeListAdapter(Context context, ArrayList<String> degreeList) {
        this.context = context;
        this.degreeList = degreeList;
    }

    @NonNull
    public DegreeListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DegreeListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.degree_view, parent,false));
    }


    @Override
    public void onBindViewHolder(DegreeListHolder holder, int position) {
        String text = degreeList.get(position).toString();
        System.out.println(position + ": " + text);
        holder.degree.setText(text);
    }


    @Override
    public int getItemCount() {
        return degreeList.size();
    }

}
