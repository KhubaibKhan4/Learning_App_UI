package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.uzair.learningappxml.R;

public class DayVideoDetailActivity extends AppCompatActivity {

    RelativeLayout layoutComments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_video_detail);

        layoutComments  = findViewById(R.id.layoutComments);

        layoutComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DayVideoDetailActivity.this, CommentActivity.class));
            }
        });
    }
}