package com.example.wishmytrip;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {


    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iv = (ImageView) findViewById(R.id.iv_splash);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);

        iv.startAnimation(myanim);

        Intent intent = new Intent(this, NavigationBar.class);
        startActivity(intent);
    }
}
