package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class AdapterVidos extends RecyclerView.Adapter<AdapterVidos.VideoViewHolder>
{

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.lecutre_item_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
