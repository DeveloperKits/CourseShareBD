package com.example.coursesharebd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    // animation video
    Animation topAnim, bottomAnim;

    ImageView logo;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anmation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        logo = (ImageView) findViewById(R.id.logo);
        textView = (TextView) findViewById(R.id.textView);

        logo.setAnimation(topAnim);
        textView.setAnimation(bottomAnim);

        //next page
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }

}