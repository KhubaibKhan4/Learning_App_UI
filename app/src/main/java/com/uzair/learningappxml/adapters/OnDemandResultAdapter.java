package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class OnDemandResultAdapter extends RecyclerView.Adapter<OnDemandResultAdapter.ResultViewHolder>
{

    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ResultViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.demand_test_result_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ResultViewHolder extends RecyclerView.ViewHolder {
        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
