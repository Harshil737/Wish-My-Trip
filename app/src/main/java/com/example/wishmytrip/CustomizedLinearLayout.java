package com.example.wishmytrip;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class CustomizedLinearLayout extends LinearLayout {
    public CustomizedLinearLayout(Context context) {
        super(context);
    }

    public CustomizedLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomizedLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomizedLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int w = MeasureSpec.getSize(widthMeasureSpec);
        int h = MeasureSpec.getSize(heightMeasureSpec);

        int newWidth = w - (int) (w / 3.0);

        super.onMeasure(MeasureSpec.makeMeasureSpec(newWidth, MeasureSpec.EXACTLY), heightMeasureSpec);
//        super.onMeasure(newWidth, MeasureSpec.makeMeasureSpec(h, MeasureSpec.EXACTLY));
    }
}
