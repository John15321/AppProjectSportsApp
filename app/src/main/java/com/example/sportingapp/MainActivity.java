package com.example.sportingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonPushUps;
    Button buttonSquats;
    Button buttonSitUps;
    Button buttonStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPushUps = (Button) findViewById(R.id.pushUps);
        buttonPushUps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                przechodzimy do innego widoku
                Intent exerciseIntent = new Intent(MainActivity.this, ExerciseActivity.class);
                exerciseIntent.putExtra("type", "pushUps");
                startActivity(exerciseIntent);
            }
        });


        buttonSitUps = (Button) findViewById(R.id.sitUps);
        buttonSitUps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                przechodzimy do innego widoku
                Intent exerciseIntent = new Intent(MainActivity.this, ExerciseActivity.class);
                exerciseIntent.putExtra("type", "sitUps");
                startActivity(exerciseIntent);
            }
        });

        buttonSquats = (Button) findViewById(R.id.squats);
        buttonSquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                przechodzimy do innego widoku
                Intent exerciseIntent = new Intent(MainActivity.this, ExerciseActivity.class);
                exerciseIntent.putExtra("type", "squats");
                startActivity(exerciseIntent);
            }
        });

        buttonStats = (Button) findViewById(R.id.stats);
        buttonStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                przechodzimy do innego widoku
                Intent exerciseIntent = new Intent(MainActivity.this, ExerciseActivity.class);
                exerciseIntent.putExtra("type", "stats");
                startActivity(exerciseIntent);
            }
        });


    }
}