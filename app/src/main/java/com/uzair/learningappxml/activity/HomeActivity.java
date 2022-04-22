package com.uzair.learningappxml.activity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.ChangedPackages;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.uzair.learningappxml.R;
import com.uzair.learningappxml.adapters.AdapterForDownloadRecycler;
import com.uzair.learningappxml.adapters.RecyclerDpsAdapter;
import com.uzair.learningappxml.adapters.TestResultRecyeclerAdapter;

public class HomeActivity extends AppCompatActivity {

    SearchView searchView;
    RecyclerView recyclerView, recyclerViewDPS , rvRecentDownloads;
    LinearLayout llLeftDrawer, llProfileDrawer;
    DrawerLayout drawerLayout;
    ImageView menuIcon, userProfileImage;
    TextView myTest , viewAll ,onDemandTestMenu ,onDemandTestResultMenu;
    // side menu layout
    RelativeLayout coursesLayoutSideMenu, testLayoutSideMenu, battalionLayoutSideMenu, discussionFormLayoutSideMenu;
    LinearLayout layoutDropDownCourses, layoutDropDownTest, layoutDropDownBattalion, disucssionFormDropDownLayout
            , myProfileLayout , changePasswordLayout,  trainigLayoutSideMenu,myDownloadsLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_home);
        setUpRecyclerView();
        initViews();
    }

    private void setUpRecyclerView()
    {
        recyclerViewDPS = findViewById(R.id.recyclerViewDPS);
        rvRecentDownloads = findViewById(R.id.rvRecentDownloads);
        recyclerView = findViewById(R.id.recyclerViewTestResult);
        rvRecentDownloads.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewDPS.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        TestResultRecyeclerAdapter adapter = new TestResultRecyeclerAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerDpsAdapter recyclerDpsAdapter = new RecyclerDpsAdapter();
        recyclerViewDPS.setAdapter(recyclerDpsAdapter);


        AdapterForDownloadRecycler adapterForDownloadRecycler = new AdapterForDownloadRecycler();
        rvRecentDownloads.setAdapter(adapterForDownloadRecycler);

    }

    private void initViews() {

        // text view view all
        viewAll = findViewById(R.id.viewAll);

        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(HomeActivity.this, BestPerformanceListActivity.class));
            }
        });

        // search view
        searchView = findViewById(R.id.searchIcon);

        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setBackgroundResource(R.drawable.bg_search_vuew);

            }
        });

        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                searchView.setBackground(null);
                return false;
            }
        });

        /// drawer left
        drawerLayout = findViewById(R.id.drawerLayout);
        menuIcon = findViewById(R.id.menuIcon);
        llLeftDrawer = findViewById(R.id.llLeftDrawer);

        // layout
        coursesLayoutSideMenu = findViewById(R.id.coursesLayoutSideMenu);
        layoutDropDownCourses = findViewById(R.id.layoutDropDownCourses);
        battalionLayoutSideMenu = findViewById(R.id.battalionLayoutSideMenu);
        layoutDropDownBattalion = findViewById(R.id.layoutDropDownBattalion);
        testLayoutSideMenu = findViewById(R.id.testLayoutSideMenu);
        layoutDropDownTest = findViewById(R.id.layoutDropDownTest);
        discussionFormLayoutSideMenu = findViewById(R.id.discussionFormLayoutSideMenu);
        disucssionFormDropDownLayout = findViewById(R.id.disucssionFormDropDownLayout);
        trainigLayoutSideMenu = findViewById(R.id.trainigLayoutSideMenu);
        onDemandTestMenu = findViewById(R.id.onDemandTestMenu);
        onDemandTestResultMenu = findViewById(R.id.onDemandTestResultMenu);

        onDemandTestResultMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, OnDemanTestResult.class));
            }
        });

        onDemandTestMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, OnDemandTestActivity.class));
            }
        });

        trainigLayoutSideMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, TrainingScheduleActivity.class));
            }
        });

        myTest = findViewById(R.id.myTestsMenu);

        myTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "My Tests", Toast.LENGTH_SHORT).show();
            }
        });

        // clicks on layout to visible and invisible
        coursesLayoutSideMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation(R.id.layoutDropDownCourses);
                if (layoutDropDownCourses.getVisibility() == LinearLayout.GONE) {
                    layoutDropDownCourses.setVisibility(LinearLayout.VISIBLE);
                } else {
                    layoutDropDownCourses.setVisibility(LinearLayout.GONE);
                }
            }
        });

        battalionLayoutSideMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation(R.id.layoutDropDownBattalion);
                if (layoutDropDownBattalion.getVisibility() == LinearLayout.GONE) {
                    layoutDropDownBattalion.setVisibility(LinearLayout.VISIBLE);
                } else {
                    layoutDropDownBattalion.setVisibility(LinearLayout.GONE);
                }
            }
        });

        testLayoutSideMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation(R.id.layoutDropDownTest);
                if (layoutDropDownTest.getVisibility() == LinearLayout.GONE) {
                    layoutDropDownTest.setVisibility(LinearLayout.VISIBLE);
                } else {
                    layoutDropDownTest.setVisibility(LinearLayout.GONE);
                }
            }
        });

        discussionFormLayoutSideMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // animation(R.id.disucssionFormDropDownLayout);
                if (disucssionFormDropDownLayout.getVisibility() == LinearLayout.GONE) {
                    disucssionFormDropDownLayout.setVisibility(LinearLayout.VISIBLE);
                } else {
                    disucssionFormDropDownLayout.setVisibility(LinearLayout.GONE);
                }
            }
        });

        // click on drawer menu icon
        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);

            }
        });


        /// drawer profile
        changePasswordLayout = findViewById(R.id.changePasswordLayout);
        llProfileDrawer = findViewById(R.id.llProfileDrawer);
        userProfileImage = findViewById(R.id.userProfileImage);
        myDownloadsLayout = findViewById(R.id.myDownloadsLayout);

        userProfileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
        });


        changePasswordLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ChangePasswordActivity.class));
            }
        });
        // my profile menu click
        myProfileLayout = findViewById(R.id.myProfileLayout);
        myProfileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MyProfileActivity.class));
            }
        });

        // donwload click
        myDownloadsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, DownloadTestPaperActivity.class));
            }
        });

    }

    private void animation(int id) {
        ViewGroup parent = findViewById(R.id.parent);
        Transition transition = new Slide(Gravity.BOTTOM);
        transition.setDuration(600);
        transition.addTarget(id);

        TransitionManager.beginDelayedTransition(parent, transition);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }
}