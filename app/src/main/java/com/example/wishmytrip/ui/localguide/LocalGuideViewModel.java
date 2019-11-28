package com.example.wishmytrip.ui.localguide;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocalGuideViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LocalGuideViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is LocalGuide fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}