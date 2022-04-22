package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.uzair.learningappxml.R;

public class StartQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
    }

    public void questionClick(View view)
    {
        startActivity(new Intent(StartQuizActivity.this, QuestionListActivity.class));
    }


    public void clickOnReport(View view)
    {

        View mView = LayoutInflater.from(StartQuizActivity.this)
                .inflate(R.layout.report_question_dialog, null);
        AlertDialog.Builder  alert = new AlertDialog.Builder(StartQuizActivity.this);
        alert.setView(mView);

        Dialog dialog = alert.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        dialog.setCanceledOnTouchOutside(false);

        dialog.show();


    }
}