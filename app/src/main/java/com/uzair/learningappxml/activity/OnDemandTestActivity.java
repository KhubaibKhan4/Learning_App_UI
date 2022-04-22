package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;
import com.uzair.learningappxml.R;
import com.uzair.learningappxml.fragments.BiologyOnDemandTest;
import com.uzair.learningappxml.fragments.BiologyTopics;
import com.uzair.learningappxml.fragments.ChemistryTopic;
import com.uzair.learningappxml.fragments.OtherInTopic;
import com.uzair.learningappxml.fragments.PhysicsTopic;

public class OnDemandTestActivity extends AppCompatActivity {

    private TabLayout tabTopics;
    private ViewPager topicsViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_deman_test);

        loadFragment(new BiologyOnDemandTest());
        setTabLayout();

    }

    // tab layout
    private void setTabLayout() {
        tabTopics = findViewById(R.id.tabLayout);

        tabTopics.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    loadFragment(new BiologyOnDemandTest());
                } else if (tab.getPosition() == 1) {
                } else if (tab.getPosition() == 2) {
                } else if (tab.getPosition() == 3) {
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