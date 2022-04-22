package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>
{

    @NonNull
    @Override
    public QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new QuestionViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.question_layout,null));
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionViewHolder holder, int position) {

        holder.questions.setText(""+(position+1));

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class QuestionViewHolder extends RecyclerView.ViewHolder {
        TextView questions;
        public QuestionViewHolder(@NonNull View itemView) {
            super(itemView);
            questions = itemView.findViewById(R.id.questionIcon);
        }
    }
}
