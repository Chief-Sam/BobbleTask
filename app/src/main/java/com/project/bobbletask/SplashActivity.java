package com.project.bobbletask;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openMainActivity =  new Intent(SplashActivity.this, MainActivity.class);
                startActivity(openMainActivity);
                finish();

            }
        }, 5000);
    }
}
