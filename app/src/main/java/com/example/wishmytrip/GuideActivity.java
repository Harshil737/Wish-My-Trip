package com.example.wishmytrip;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class GuideActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_activity_main);
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        com.example.recyclerview.demo fragment = new com.example.recyclerview.demo();
//        fragmentTransaction.add(R.id.load_frag, fragment);
//        fragmentTransaction.commit();


//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.replace(R.id.nav_host_fragment, new demo());
//        ft.commit();

//        demo newFragment = new demo();
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.add(R.id.nav_host_fragment, newFragment).commit();

        FragmentManager fragmentManager = getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_fragment, new demo());
        fragmentTransaction.commit();
    }
}
