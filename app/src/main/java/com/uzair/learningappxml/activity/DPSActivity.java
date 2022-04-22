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
import com.uzair.learningappxml.fragments.BiologyAudioBooks;
import com.uzair.learningappxml.fragments.BiologyBooklets;
import com.uzair.learningappxml.fragments.BiologyDPS;
import com.uzair.learningappxml.fragments.BiologyDownloads;
import com.uzair.learningappxml.fragments.BiologyTopics;
import com.uzair.learningappxml.fragments.BiologyVideos;
import com.uzair.learningappxml.fragments.ChemistryTopic;
import com.uzair.learningappxml.fragments.OtherInTopic;
import com.uzair.learningappxml.fragments.PhysicsTopic;

public class DPSActivity extends AppCompatActivity {

    private TextView title;
    private TabLayout tabTopics;
    private ViewPager topicsViewPager;
    private TextView filterSort;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpsactivity);

        initViews();
        setTabLayout();
        loadStartFragment();
    }

    private void loadStartFragment()
    {
        switch (type)
    {
        case "dps":{
            title.setText("Daily Practice Papers");
            loadFragment(new BiologyDPS());
            break;
        }

        case "videos":{
            title.setText("Videos");
            loadFragment(new BiologyVideos());
            break;
        }


        case "downloads":{
            title.setText("Downloads");
            loadFragment(new BiologyDownloads());
            break;
        }


        case "booklets":{
            title.setText("Booklets");
            loadFragment(new BiologyBooklets());
            break;
        }

        case "audiobooks":{
            title.setText("Audio Books");
            loadFragment(new BiologyAudioBooks());
            break;
        }




    }


    }

    private void initViews() {

        // get type
        title = findViewById(R.id.title);
        type = getIntent().getStringExtra("type");

        // filter sort bottom sheet dialog
        filterSort = findViewById(R.id.sort);
        filterSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View mView = LayoutInflater.from(DPSActivity.this)
                        .inflate(R.layout.sort_bottom_sheet_dialog, null);
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DPSActivity.this, R.style.SheetDialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);
                bottomSheetDialog.setContentView(mView);
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

                switch (type)
                {
                    case "dps":{
                        title.setText("Daily Practice Papers");
                        if (tab.getPosition() == 0) {
                            loadFragment(new BiologyDPS());
                        } else if (tab.getPosition() == 1) {

                        } else if (tab.getPosition() == 2) {

                        } else if (tab.getPosition() == 3) {
                        }
                        break;
                    }

                    case "videos":{
                        title.setText("Videos");
                        if (tab.getPosition() == 0) {
                            loadFragment(new BiologyVideos());
                        } else if (tab.getPosition() == 1) {

                        } else if (tab.getPosition() == 2) {

                        } else if (tab.getPosition() == 3) {
                        }
                        break;
                    }


                    case "downloads":{
                        title.setText("Downloads");
                        if (tab.getPosition() == 0) {
                            loadFragment(new BiologyDownloads());
                        } else if (tab.getPosition() == 1) {

                        } else if (tab.getPosition() == 2) {

                        } else if (tab.getPosition() == 3) {
                        }
                        break;
                    }


                    case "booklets":{
                        title.setText("Booklets");
                        if (tab.getPosition() == 0) {
                            loadFragment(new BiologyBooklets());
                        } else if (tab.getPosition() == 1) {

                        } else if (tab.getPosition() == 2) {

                        } else if (tab.getPosition() == 3) {
                        }
                        break;
                    }

                      case "audiobooks":{
                          title.setText("Audio Books");
                          if (tab.getPosition() == 0) {
                              loadFragment(new BiologyAudioBooks());
                          } else if (tab.getPosition() == 1) {

                          } else if (tab.getPosition() == 2) {

                          } else if (tab.getPosition() == 3) {
                          }
                        break;
                    }




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