package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;
import com.uzair.learningappxml.R;
import com.uzair.learningappxml.fragments.BiologyTopics;
import com.uzair.learningappxml.fragments.ChemistryTopic;
import com.uzair.learningappxml.fragments.OtherInTopic;
import com.uzair.learningappxml.fragments.PhysicsTopic;

public class TopicsActivity extends AppCompatActivity {

    private TabLayout tabTopics;
    private ViewPager topicsViewPager;
    private TextView filterSort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);

        loadFragment(new BiologyTopics());

        setTabLayout();
        initViews();

    }

    private void initViews() {
        // filter sort bottom sheet dialog
        filterSort = findViewById(R.id.filterSort);
        filterSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View mView = LayoutInflater.from(TopicsActivity.this)
                        .inflate(R.layout.bottom_sheet_filter_dialog, null);
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(TopicsActivity.this, R.style.SheetDialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);
                bottomSheetDialog.setContentView(mView);

                View indicatorFilter, indicatorSort;
                LinearLayout filterContent, sortContent;
                RelativeLayout filterLayout, sortLayout;

                indicatorFilter = mView.findViewById(R.id.indicatorFilter);
                indicatorSort = mView.findViewById(R.id.indicatorSort);
                filterContent = mView.findViewById(R.id.layoutFilter);
                sortContent = mView.findViewById(R.id.layoutSort);
                filterLayout = mView.findViewById(R.id.filterLayout);
                sortLayout = mView.findViewById(R.id.sortLayout);

                // click on filter and sort layout
                filterLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        indicatorSort.setVisibility(View.GONE);
                        indicatorFilter.setVisibility(View.VISIBLE);
                        filterContent.setVisibility(View.VISIBLE);
                        sortContent.setVisibility(View.GONE);

                    }
                });

                sortLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        indicatorSort.setVisibility(View.VISIBLE);
                        indicatorFilter.setVisibility(View.GONE);
                        filterContent.setVisibility(View.GONE);
                        sortContent.setVisibility(View.VISIBLE);

                    }
                });


                bottomSheetDialog.show();

            }
        });
    }

    // tab layout
    private void setTabLayout() {
        tabTopics = findViewById(R.id.tabLayout);

        tabTopics.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    loadFragment(new BiologyTopics());
                } else if (tab.getPosition() == 1) {
                    loadFragment(new PhysicsTopic());
                } else if (tab.getPosition() == 2) {
                    loadFragment(new ChemistryTopic());
                } else if (tab.getPosition() == 3) {
                    loadFragment(new OtherInTopic());
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.layoutContainer, fragment)
                .commit();

    }
}