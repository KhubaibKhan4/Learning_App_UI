package com.uzair.learningappxml.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.uzair.learningappxml.R;
import com.uzair.learningappxml.activity.DPSActivity;

public class AdapterAudioBooks extends RecyclerView.Adapter<AdapterAudioBooks.AudioViewHolder>
{

    @NonNull
    @Override
    public AudioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AudioViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.audio_book_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull AudioViewHolder holder, int position)
    {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View mView = LayoutInflater.from(v.getContext())
                        .inflate(R.layout.bottom_sheet_audio_player_dialog, null);
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(v.getContext(), R.style.SheetDialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);
                bottomSheetDialog.setContentView(mView);
                bottomSheetDialog.show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class AudioViewHolder extends RecyclerView.ViewHolder {
        public AudioViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
