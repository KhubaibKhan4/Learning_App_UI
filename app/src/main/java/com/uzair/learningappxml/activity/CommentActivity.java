package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.CommentsAdapter;

public class CommentActivity extends AppCompatActivity {

    RecyclerView rvComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_comment);
        setUpRecyclerView();
    }

    private void setUpRecyclerView()
    {
        rvComment = findViewById(R.id.rvComments);
        rvComment.setLayoutManager(new LinearLayoutManager(this));
        CommentsAdapter adapter = new CommentsAdapter();
        rvComment.setAdapter(adapter);
    }
}