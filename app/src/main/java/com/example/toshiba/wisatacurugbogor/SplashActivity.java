package com.example.toshiba.wisatacurugbogor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_TIME = 4 * 1000;//set waktu 4 detik
    ProgressBar prg;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
     prg = (ProgressBar)findViewById(R.id.progressBar);//Tampilan progress bar
        final boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new
                        Intent(SplashActivity.this, WisataCurugBogor.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
        new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
         }
     },SPLASH_TIME);

    }
    }



