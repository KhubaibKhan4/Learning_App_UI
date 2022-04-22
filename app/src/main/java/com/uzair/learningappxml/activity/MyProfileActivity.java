package com.uzair.learningappxml.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.uzair.learningappxml.R;

public class MyProfileActivity extends AppCompatActivity {

    SearchView searchView;
    LinearLayout llLeftDrawer, llProfileDrawer;
    DrawerLayout drawerLayout;
    ImageView menuIcon, userProfileImage;
    TextView myTest;
    // side menu layout
    RelativeLayout coursesLayoutSideMenu, testLayoutSideMenu, battalionLayoutSideMenu, discussionFormLayoutSideMenu;
    LinearLayout layoutDropDownCourses, layoutDropDownTest, layoutDropDownBattalion, disucssionFormDropDownLayout, myProfileLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_my_profile);
        initViews();
    }

    private void initViews() {

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
        drawerLayout = findViewById(R.id.drawerLayoutMyProfile);
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

        myTest = findViewById(R.id.myTestsMenu);
        myTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyProfileActivity.this, "My Tests", Toast.LENGTH_SHORT).show();
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
        llProfileDrawer = findViewById(R.id.llProfileDrawer);
        userProfileImage = findViewById(R.id.userProfileImage);
        userProfileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
        });


        // my profile menu click
        myProfileLayout = findViewById(R.id.myProfileLayout);
        myProfileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
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

    public void editProfileClick(View view)
    {
        startActivity(new Intent(MyProfileActivity.this, EditProfileActivity.class));
    }
}