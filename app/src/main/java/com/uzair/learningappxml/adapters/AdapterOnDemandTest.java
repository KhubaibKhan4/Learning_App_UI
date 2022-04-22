package com.uzair.learningappxml.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.activity.TestInstructionActivity;

public class AdapterOnDemandTest extends RecyclerView.Adapter<AdapterOnDemandTest.TestViewHolder>
{

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TestViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.on_demand_test_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position)
    {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), TestInstructionActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class TestViewHolder extends RecyclerView.ViewHolder {
        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
