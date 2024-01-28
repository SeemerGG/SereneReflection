package com.example.serenereflection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivityOne extends AppCompatActivity {

    private final static int SPLASH_TIMER = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_one);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivityOne.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        }, SPLASH_TIMER);
    }
}