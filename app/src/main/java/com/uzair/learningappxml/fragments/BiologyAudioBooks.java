package com.uzair.learningappxml.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterAudioBooks;


public class BiologyAudioBooks extends Fragment {

    RecyclerView rvAudioBooks;
    View mView;

   public BiologyAudioBooks() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_biology_autdio_books, container, false);
        setUpRecyclerView();
        return mView;
    }

    private void setUpRecyclerView()
    {
        rvAudioBooks = mView.findViewById(R.id.rvBiologyAudioBooks);
        rvAudioBooks.setLayoutManager(new LinearLayoutManager(getContext()));

        AdapterAudioBooks adapterAudioBooks = new AdapterAudioBooks();
        rvAudioBooks.setAdapter(adapterAudioBooks);
    }
}