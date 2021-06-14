package com.example.sportingapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExerciseActivity extends MainActivity implements View.OnClickListener {
    final private long TIME_ON_TIMER = 30000;
    private long timerTime = TIME_ON_TIMER;
    Button buttonBack;
    private CountDownTimer timer;
    TextView timerText;
    boolean timerIsRunning = false;
    Button buttonStartStop;
    private String typeOfExercies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        przypisujemy layout
        setContentView(R.layout.exercise);

        typeOfExercies = getIntent().getExtras().getString("type");

        timerText = (TextView) findViewById(R.id.timer);

        buttonBack = (Button) findViewById(R.id.back);
        buttonBack.setOnClickListener((View.OnClickListener) this);

        buttonStartStop = (Button) findViewById(R.id.startStop);
        buttonStartStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timerIsRunning){
                    stopTimer();
                }else{
                    startTimer();
                }
            }
        });

        String timeToText = String.format("%d", timerTime/1000);
        timerText.setText(timeToText);

    }

    @Override
    public void onClick(View v) {
        finish();
    }

    private void startTimer() {
        timer = new CountDownTimer(timerTime, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerTime = millisUntilFinished;
                String timeToText = String.format("%d", timerTime/1000);
                timerText.setText(timeToText);
            }

            @Override
            public void onFinish() {
                timerIsRunning = false;
                timerTime = TIME_ON_TIMER;

            }
        }.start();

        timerIsRunning = true;
        buttonStartStop.setText("Stop");
    }

    private void stopTimer() {
        timer.cancel();
        timerIsRunning=false;
        buttonStartStop.setText("Start");

    }
}
