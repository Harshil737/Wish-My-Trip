package com.example.wishmytrip.ui.bookingdetails;

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

public class BookingDetailsFragment extends Fragment {

    private BookingDetailsViewModel bookingDetailsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bookingDetailsViewModel =
                ViewModelProviders.of(this).get(BookingDetailsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_booking_details, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        bookingDetailsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}