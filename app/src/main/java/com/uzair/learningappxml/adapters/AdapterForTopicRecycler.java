package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class AdapterForTopicRecycler extends RecyclerView.Adapter<AdapterForTopicRecycler.TopicViewHolder>
{

    @NonNull
    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopicViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_topic_recyler, null));
    }

    @Override
    public void onBindViewHolder(@NonNull TopicViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class TopicViewHolder extends RecyclerView.ViewHolder {
        public TopicViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
