package com.example.wishmytrip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class Slider extends Fragment {

    private static String LOG_TAG = Slider.class.getSimpleName();
    private ImageView imageView;
    private View view;
    private String url;

    public Slider() {

    }

    public Slider(String url) {
        this.url = url;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_slider, container, false);
        imageView = (ImageView) view.findViewById(R.id.slide_imag);
        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.background)
                .into(imageView);
        return view;
    }

}
