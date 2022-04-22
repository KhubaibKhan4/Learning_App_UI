package com.uzair.learningappxml.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterDPS;

public class BiologyDPS extends Fragment {

    RecyclerView rvDps;
    View mView;

    public BiologyDPS() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView =  inflater.inflate(R.layout.fragment_biology_d_p_s, container, false);

        setUpRecyclerView();

        return mView;
    }

    private void setUpRecyclerView()
    {
        rvDps = mView.findViewById(R.id.rvBiologyDPS);
        rvDps.setLayoutManager(new LinearLayoutManager(getContext()));

        AdapterDPS adapterDPS = new AdapterDPS();
        rvDps.setAdapter(adapterDPS);


    }
}