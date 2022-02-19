package com.example.sumitrsaurabh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //code

                Intent intent= new Intent(MainActivity.this, SplashNot_Activity.class);
                startActivity(intent);
                finish(); //REMOVES ACTIVITY FROM Stack
            }
        },2500);

    }
}
