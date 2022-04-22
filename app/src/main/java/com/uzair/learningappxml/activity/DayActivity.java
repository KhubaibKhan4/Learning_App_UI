package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterForLectureDisplay;

public class DayActivity extends AppCompatActivity {

    RecyclerView rvLectureDayWise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        setUpRecyclerView();
    }

    private void setUpRecyclerView()
    {
        rvLectureDayWise = findViewById(R.id.rvLectureDayWise);
        rvLectureDayWise.setLayoutManager(new LinearLayoutManager(this));
        AdapterForLectureDisplay  adapter = new AdapterForLectureDisplay();
        rvLectureDayWise.setAdapter(adapter);
    }
}