package com.uzair.learningappxml.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterForDownloadRecycler;
import com.uzair.learningappxml.adapters.OnDemandResultAdapter;
import com.uzair.learningappxml.adapters.TestResultRecyeclerAdapter;


public class DemandResultBiologyFragment extends Fragment {

    View mView;
    RecyclerView rvTestResult;


    public DemandResultBiologyFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_demand_result_biology, container, false);
        setUpRecyclerView();
        return mView;
    }

    private void setUpRecyclerView()
    {
        rvTestResult = mView.findViewById(R.id.rvTestResult);
        rvTestResult.setLayoutManager(new LinearLayoutManager(getContext()));
        OnDemandResultAdapter adapter = new OnDemandResultAdapter();
        rvTestResult.setAdapter(adapter);
    }
}