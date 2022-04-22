package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class AdapterForDownloadRecycler extends RecyclerView.Adapter<AdapterForDownloadRecycler.DownloadViewHolder>
{

    @NonNull
    @Override
    public DownloadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DownloadViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.layout_download_recycler, null));
    }

    @Override
    public void onBindViewHolder(@NonNull DownloadViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class DownloadViewHolder extends RecyclerView.ViewHolder {
        public DownloadViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
