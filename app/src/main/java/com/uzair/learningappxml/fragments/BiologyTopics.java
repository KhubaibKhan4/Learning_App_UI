package com.uzair.learningappxml.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterForTopicRecycler;

public class BiologyTopics extends Fragment {

    View mView;
    RecyclerView bioTopicRvList;

    public BiologyTopics() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_biology_topics, container, false);

        setUpRecyclerView();

        return mView;
    }

    private void setUpRecyclerView()
    {
        bioTopicRvList = mView.findViewById(R.id.bioTopicList);
        bioTopicRvList.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterForTopicRecycler adapterForTopicRecycler = new AdapterForTopicRecycler();
        bioTopicRvList.setAdapter(adapterForTopicRecycler);
    }
}