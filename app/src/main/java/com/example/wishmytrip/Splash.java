package com.example.wishmytrip;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wishmytrip.ui.login.LoginActivity;

public class Splash extends AppCompatActivity {


    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iv = (ImageView) findViewById(R.id.iv_splash);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    Animation myanim = AnimationUtils.loadAnimation(Splash.this, R.anim.mytransition);
                    iv.startAnimation(myanim);
                    sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent homeIntent = new Intent(Splash.this, NavigationBar.class);
                    startActivity(homeIntent);
                }
            }
        };
        timerThread.start();
    }
}
