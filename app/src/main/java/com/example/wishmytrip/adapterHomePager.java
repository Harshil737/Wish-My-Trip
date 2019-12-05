package com.example.wishmytrip;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.wishmytrip.ui.home.HomeFragment;

public class adapterHomePager extends FragmentPagerAdapter {

    private HomeFragment homeFragment;

    public adapterHomePager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                homeFragment = new HomeFragment();
                return homeFragment;
            default:
                return null;
        }
    }

//    public void populteProductList(String url) {
//        mProductListFragment.makeCall(url);
//    }

//    public void callCategoryData() {
//        homeFragment.getNewData();
//    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "HOME";
        } else {
            return "CATEGORIES";
        }

    }
}