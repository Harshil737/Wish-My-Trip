package com.example.wishmytrip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

/**
 * Created by Patel on 01-07-2017.
 */

public class nonSwipableViewPager extends ViewPager {

    private Boolean enabled;

    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, false);
    }

    public nonSwipableViewPager(Context context) {
        super(context);
        this.enabled = true;
    }

    public nonSwipableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (this.enabled)
            return super.onTouchEvent(ev);
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.enabled)
            return super.onInterceptTouchEvent(ev);
        return false;
    }
}