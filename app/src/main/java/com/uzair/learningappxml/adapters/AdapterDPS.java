package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class AdapterDPS extends RecyclerView.Adapter<AdapterDPS.DpsViewHolder>
{

    @NonNull
    @Override
    public DpsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DpsViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.daily_practice_paper_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull DpsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class DpsViewHolder extends RecyclerView.ViewHolder {
        public DpsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
