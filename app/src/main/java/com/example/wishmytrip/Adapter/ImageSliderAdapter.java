package com.example.wishmytrip.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.wishmytrip.Slider;


public class ImageSliderAdapter extends FragmentPagerAdapter {

    String path1, path2, path3;

    public ImageSliderAdapter(FragmentManager fm, String path1, String path2, String path3) {
        super(fm);
        this.path1 = path1;
        this.path2 = path2;
        this.path3 = path3;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new Slider(path1);
        else if (position == 1)
            return new Slider(path2);
        else if (position == 2)
            return new Slider(path3);
        else
            return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
