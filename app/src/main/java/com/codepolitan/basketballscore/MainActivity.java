package com.codepolitan.basketballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView home_score, away_score;
    Integer score_a, score_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home_score = findViewById(R.id.home_score);
        away_score = findViewById(R.id.away_score);
        score_a = 0;
        score_b = 0;
    }

    public void home_1(View view) {
        score_a = Integer.parseInt(home_score.getText().toString());
        score_a++;
        home_score.setText(String.valueOf(score_a));
    }

    public void home_2(View view) {
        score_a = Integer.parseInt(home_score.getText().toString());
        score_a += 2;
        home_score.setText(String.valueOf(score_a));
    }

    public void home_3(View view) {
        score_a = Integer.parseInt(home_score.getText().toString());
        score_a += 3;
        home_score.setText(String.valueOf(score_a));
    }

    public void away_1(View view) {
        score_b = Integer.parseInt(away_score.getText().toString());
        score_b++;
        away_score.setText(String.valueOf(score_b));
    }

    public void away_2(View view) {
        score_b = Integer.parseInt(away_score.getText().toString());
        score_b += 2;
        away_score.setText(String.valueOf(score_b));
    }

    public void away_3(View view) {
        score_b = Integer.parseInt(away_score.getText().toString());
        score_b += 3;
        away_score.setText(String.valueOf(score_b));
    }

    public void reset(View view) {
        home_score.setText("0");
        away_score.setText("0");
    }
}
