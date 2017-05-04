package com.example.android.baseballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    int outTeamA;
    int outTeamB;
    int resetTeamA;
    int resetTeamB;
    int resetTeamAOut;
    int resetTeamBOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_out);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_out);
        scoreView.setText(String.valueOf(score));
    }

    public void addOnePointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOnePointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoOutForTeamA(View v) {
        outTeamA = outTeamA + 1;
        displayForTeamAOut(outTeamA);
    }

    public void addTwoOutForTeamB(View v) {
        outTeamB = outTeamB + 1;
        displayForTeamBOut(outTeamB);
    }

    public void resetButton(View v) {
        resetTeamA = scoreTeamA = 0;
        resetTeamB = scoreTeamB = 0;
        resetTeamAOut = outTeamA = 0;
        resetTeamBOut = outTeamB = 0;
        displayForTeamA(resetTeamA);
        displayForTeamB(resetTeamB);
        displayForTeamAOut(resetTeamAOut);
        displayForTeamBOut(resetTeamBOut);
    }
}
