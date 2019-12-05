package com.example.wishmytrip;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    //    private static int CAT_COUNT = 0, NEW_COUNT = 0, POPULAR_COUNT = 0, OFFER_COUNT = 0;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private nonSwipableViewPager viewPager;
    private adapterHomePager adapter;
    private String url = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout = findViewById(R.id.main_drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        navigationView = findViewById(R.id.main_nav);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawer(Gravity.LEFT);
                switch (item.getItemId()) {
                    case R.id.nav_category:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.nav_home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.nav_cart:
//                        Intent cartIntent = new Intent(MainActivity.this, Cart.class);
//                        startActivity(cartIntent);
                        break;
                    case R.id.nav_profile:
//                        Intent profileIntent = new Intent(MainActivity.this, UserProfile.class);
//                        profileIntent.putExtra("uid", uid);
//                        startActivity(profileIntent);
                        break;
                    case R.id.nav_order:
//                        Intent orderIntent = new Intent(MainActivity.this, Order.class);
//                        orderIntent.putExtra("uid", uid);
//                        startActivity(orderIntent);
                        break;
                    case R.id.nav_fav:
//                        Intent favIntent = new Intent(MainActivity.this, Favourite.class);
//                        favIntent.putExtra("uid", uid);
//                        startActivity(favIntent);
                        break;
                    case R.id.nav_logOut:
                        SharedPreferences preferences1 = getSharedPreferences("system", MODE_PRIVATE);
                        preferences1.edit().clear().apply();
//                        Intent i = new Intent(MainActivity.this, Login.class);
//                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                        startActivity(i);
                        break;
                }
                return true;
            }
        });

        tabLayout = findViewById(R.id.main_tablayout);
        viewPager = findViewById(R.id.main_viewpager);
        viewPager.setOffscreenPageLimit(5);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 1:
//                        adapter.callCategoryData();
                        getSupportActionBar().setTitle("Categories");
                        break;
                    case 2:
                        getSupportActionBar().setTitle("LOL");
//                        adapter.populteProductList(url);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
