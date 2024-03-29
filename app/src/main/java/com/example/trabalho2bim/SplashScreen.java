package com.example.trabalho2bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                mostrarInicio();
            }
        }, 5000);
    }
    private void mostrarInicio() {
        Intent intent = new Intent(SplashScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}