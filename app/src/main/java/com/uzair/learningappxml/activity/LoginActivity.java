package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uzair.learningappxml.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void forgotPassword(View view)
    {
        startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
    }
}