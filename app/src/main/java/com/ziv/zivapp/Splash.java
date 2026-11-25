package com.ziv.zivapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash extends AppCompatActivity {

    ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        myImageView=findViewById(R.id.imageView);

        Thread mySplashThread = new Thread() {
            @Override
            public void run() {
                try {
                    // Wait for 3 seconds (simulate loading)

                    Animation myanim= AnimationUtils.loadAnimation(Splash.this,R.anim.tween);
                    myImageView.startAnimation(myanim);


                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {


                  Intent go= new Intent(Splash.this, MainActivity.class);
                  startActivity(go);
                    // Code to run after the delay (e.g., transition to the main screen)
                }
            }
        };

// Start the thread!
        mySplashThread.start();
    }
}