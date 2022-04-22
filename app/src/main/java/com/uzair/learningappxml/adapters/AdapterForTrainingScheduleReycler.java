package com.uzair.learningappxml.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.activity.DayActivity;

public class AdapterForTrainingScheduleReycler extends RecyclerView.Adapter<AdapterForTrainingScheduleReycler.MyViewHolder>
{

    @NonNull
    @Override
    public AdapterForTrainingScheduleReycler.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_training_schedule, null));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForTrainingScheduleReycler.MyViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), DayActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
