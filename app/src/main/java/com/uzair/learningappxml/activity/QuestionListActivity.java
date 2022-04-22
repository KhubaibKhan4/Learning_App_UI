package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.QuestionAdapter;

public class QuestionListActivity extends AppCompatActivity {

    RecyclerView rvQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);

        setUpRecyclerView();
    }

    private void setUpRecyclerView()
    {
        rvQuestions = findViewById(R.id.rvQuestions);
        rvQuestions.setLayoutManager(new GridLayoutManager(this, 5));
        QuestionAdapter adapter = new QuestionAdapter();
        rvQuestions.setAdapter(adapter);
    }
}