package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class AdapterBestPerformanceRecycler extends RecyclerView.Adapter<AdapterBestPerformanceRecycler.PerformanceViewHolder> {
    @NonNull
    @Override
    public PerformanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PerformanceViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.layout_best_performance, null));
    }

    @Override
    public void onBindViewHolder(@NonNull PerformanceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class PerformanceViewHolder extends RecyclerView.ViewHolder {
        public PerformanceViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
