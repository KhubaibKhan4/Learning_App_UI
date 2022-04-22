package com.uzair.learningappxml.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdatperBiologyBooklets;


public class BiologyBooklets extends Fragment {

    private RecyclerView rvBooklets;
    private View mView;


    public BiologyBooklets() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_biology_booklets, container, false);

        setUpRecyclerView();

        return mView;
    }

    private void setUpRecyclerView()
    {
        rvBooklets = mView.findViewById(R.id.rvBiologyBooklets);
        rvBooklets.setLayoutManager(new LinearLayoutManager(getContext()));

        AdatperBiologyBooklets adatperBiologyBooklets = new AdatperBiologyBooklets();
        rvBooklets.setAdapter(adatperBiologyBooklets);
    }
}