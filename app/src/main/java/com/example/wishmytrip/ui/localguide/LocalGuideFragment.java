package com.example.wishmytrip.ui.localguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.wishmytrip.R;

public class LocalGuideFragment extends Fragment {

    private LocalGuideViewModel localGuideViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        localGuideViewModel =
                ViewModelProviders.of(this).get(LocalGuideViewModel.class);
        View root = inflater.inflate(R.layout.activity_about_us, container, false);
        final TextView textView = root.findViewById(R.id.textaboutus);
        localGuideViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
             //   textView.setText(s);
            }
        });
        return root;
    }
}