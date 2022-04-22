package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

public class AdapterBiologyDownload extends RecyclerView.Adapter<AdapterBiologyDownload.DonwloadViewHolder>
{
    @NonNull
    @Override
    public AdapterBiologyDownload.DonwloadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DonwloadViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.layout_download_recycler, null));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBiologyDownload.DonwloadViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class DonwloadViewHolder extends RecyclerView.ViewHolder {
        TextView textUploaded;
        public DonwloadViewHolder(@NonNull View itemView) {
            super(itemView);

            textUploaded = itemView.findViewById(R.id.textUploaded);
            textUploaded.setVisibility(View.VISIBLE);
        }
    }
}
