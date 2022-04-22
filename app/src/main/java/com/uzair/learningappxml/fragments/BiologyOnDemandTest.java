package com.uzair.learningappxml.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterOnDemandTest;

public class BiologyOnDemandTest extends Fragment {

    RecyclerView rvDemandTest;
    View mView;


    public BiologyOnDemandTest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_biology_on_demand_test, container, false);

        setUpRecyclerView();

        return mView;
    }

    private void setUpRecyclerView()
    {
        rvDemandTest = mView.findViewById(R.id.rvOnDemandTest);
        rvDemandTest.setLayoutManager(new LinearLayoutManager(getContext()));

        AdapterOnDemandTest adapterOnDemandTest = new AdapterOnDemandTest();
        rvDemandTest.setAdapter(adapterOnDemandTest);
    }
}