package com.example.scoreboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count1 = 0;
    int count2 = 0;

    TextView score_a, score_b;
    Button one_a, one_b, two_a, two_b, three_a, three_b, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one_a = findViewById(R.id.one_a);
        one_b = findViewById(R.id.one_b);
        two_a = findViewById(R.id.two_a);
        two_b = findViewById(R.id.two_b);
        three_a = findViewById(R.id.three_a);
        three_b = findViewById(R.id.three_b);
        reset = findViewById(R.id.reset);

        score_a = findViewById(R.id.score_a);
        score_b = findViewById(R.id.score_b);

        one_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1 = count1 + 1;
                score_a.setText("" + count1);
            }
        });

        one_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2 = count2 + 1;
                score_b.setText("" + count2);
            }
        });

        two_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1 = count1 + 2;
                score_a.setText("" + count1);
            }
        });

        two_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2 = count2 + 2;
                score_b.setText("" + count2);
            }
        });

        three_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1 = count1 + 3;
                score_a.setText("" + count1);
            }
        });

        three_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2 = count2 + 3;
                score_b.setText("" + count2);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1 = 0;
                count2 = 0;
                score_a.setText("" + count1);
                score_b.setText("" + count2);
            }
        });

    }
}