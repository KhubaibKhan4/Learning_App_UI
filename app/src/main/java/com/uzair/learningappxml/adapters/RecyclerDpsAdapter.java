package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class RecyclerDpsAdapter  extends RecyclerView.Adapter<RecyclerDpsAdapter.DpsViewHolder>
{

    @NonNull
    @Override
    public RecyclerDpsAdapter.DpsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DpsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_dps_item,null));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDpsAdapter.DpsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class DpsViewHolder extends RecyclerView.ViewHolder {
        public DpsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
