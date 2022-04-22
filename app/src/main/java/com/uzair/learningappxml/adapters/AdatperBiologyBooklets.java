package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uzair.learningappxml.R;

import org.w3c.dom.Text;

public class AdatperBiologyBooklets extends RecyclerView.Adapter<AdatperBiologyBooklets.BookletViewHolder>
{

    @NonNull
    @Override
    public BookletViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookletViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_download_recycler, null));
    }

    @Override
    public void onBindViewHolder(@NonNull BookletViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class BookletViewHolder extends RecyclerView.ViewHolder {

        ImageView downloadIcon;
        TextView textOpen , notTitle;

        public BookletViewHolder(@NonNull View itemView) {
            super(itemView);

            downloadIcon = itemView.findViewById(R.id.downloadIcon);
           // downloadIcon.setVisibility(View.GONE);

            notTitle = itemView.findViewById(R.id.notTitle);
            notTitle.setText("Location and movement");
//            textOpen = itemView.findViewById(R.id.textOpen);
//            textOpen.setVisibility(View.VISIBLE);

        }
    }
}
