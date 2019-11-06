package com.example.wishmytrip.ui.bookingdetails;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookingDetailsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BookingDetailsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Booking Details fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}