package com.example.mymidterm;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(ItemListActivity.class)
                .withSplashTimeOut(5000)
                .withBackgroundResource(android.R.color.holo_purple)
                .withBackgroundColor(Color.parseColor("#1a1b29"))
                //.withHeaderText("Hello!")
                //.withFooterText("Thanks for visiting my app")
                .withBeforeLogoText("Hello!")
                .withAfterLogoText("Thanks for visiting my app!")
                .withLogo(R.drawable.purple);

        //config.getHeaderTextView().setTextColor(Color.WHITE);
        //config.getFooterTextView().setTextColor(Color.WHITE);
        config.getBeforeLogoTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);
        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}
