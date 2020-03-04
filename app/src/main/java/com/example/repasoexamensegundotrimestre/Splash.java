package com.example.repasoexamensegundotrimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        image = (ImageView) findViewById(R.id.image);

        Animation desenfoque = AnimationUtils.loadAnimation(this, R.anim.fadein);
        image.setAnimation(desenfoque);

        Animation translate = AnimationUtils.loadAnimation(this, R.anim.translate);
        image.setAnimation(translate);

        Animation vibracion = AnimationUtils.loadAnimation(this, R.anim.shake);
        image.setAnimation(vibracion);

        Animation saleDerechaAlCentro = AnimationUtils.loadAnimation(this, R.anim.rotate);
        image.setAnimation(saleDerechaAlCentro);



        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
