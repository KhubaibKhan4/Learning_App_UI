package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uzair.learningappxml.R;

public class TestInstructionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_instruction);
    }
    public void openTestActivity(View view)
    {
        startActivity(new Intent(TestInstructionActivity.this, StartQuizActivity.class));
    }
}