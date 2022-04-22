package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterDownloadTestPaperRecycler;

public class DownloadTestPaperActivity extends AppCompatActivity {

    RecyclerView rvDTP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_test_paper);

        setUpRecyclerView();
    }

    private void setUpRecyclerView()
    {
        rvDTP = findViewById(R.id.rvDTP);
        rvDTP.setLayoutManager(new LinearLayoutManager(this));
        AdapterDownloadTestPaperRecycler adapterDownloadTestPaperRecycler = new AdapterDownloadTestPaperRecycler();
        rvDTP.setAdapter(adapterDownloadTestPaperRecycler);
    }
}