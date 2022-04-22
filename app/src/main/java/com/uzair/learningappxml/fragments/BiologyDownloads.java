package com.uzair.learningappxml.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterBiologyDownload;


public class BiologyDownloads extends Fragment {


    private RecyclerView rvDownloads;
    private View mView;

    public BiologyDownloads() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_biology_downloads, container, false);
        setUpRecyclerView();
        return mView;
    }

    private void setUpRecyclerView() {
        rvDownloads = mView.findViewById(R.id.rvBiologyDownloads);
        rvDownloads.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterBiologyDownload adapterBiologyDownload = new AdapterBiologyDownload();
        rvDownloads.setAdapter(adapterBiologyDownload);
    }
}