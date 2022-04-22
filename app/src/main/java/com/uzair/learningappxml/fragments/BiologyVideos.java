package com.uzair.learningappxml.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterVidos;

public class BiologyVideos extends Fragment {

    private RecyclerView rvVideo;
    private View mView;


    public BiologyVideos() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_biology_videos, container, false);

        setupRecyclerView();
        return mView;
    }

    private void setupRecyclerView()
    {
        rvVideo = mView.findViewById(R.id.rvVideos);
        rvVideo.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterVidos adapterVidos = new AdapterVidos();
        rvVideo.setAdapter(adapterVidos);
    }
}