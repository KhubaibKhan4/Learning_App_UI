package com.uzair.learningappxml.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.activity.DayVideoDetailActivity;

public class AdapterForLectureDisplay extends RecyclerView.Adapter<AdapterForLectureDisplay.LectureViewHolder>
{

    @NonNull
    @Override
    public LectureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LectureViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.lecture_day_wise_prgress_stepper_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull LectureViewHolder holder, int position)
    {
        holder.layoutVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               v.getContext().startActivity(new Intent(v.getContext(), DayVideoDetailActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class LectureViewHolder extends RecyclerView.ViewHolder {
        LinearLayout layoutVideo;
        public LectureViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutVideo  = itemView.findViewById(R.id.layoutVideo);
        }
    }
}
