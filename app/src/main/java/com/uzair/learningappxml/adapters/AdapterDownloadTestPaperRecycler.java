package com.uzair.learningappxml.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.activity.BestPerformanceListActivity;

public class AdapterDownloadTestPaperRecycler extends RecyclerView.Adapter<AdapterDownloadTestPaperRecycler.DTPViewHolder>
{
    @NonNull
    @Override
    public DTPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DTPViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.download_test_papers_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull DTPViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), BestPerformanceListActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class DTPViewHolder extends RecyclerView.ViewHolder
    {
        public DTPViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
