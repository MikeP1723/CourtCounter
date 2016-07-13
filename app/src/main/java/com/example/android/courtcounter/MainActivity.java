package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreeForTeamA(View view) {
        displayForTeamA(3);
    }

    public void plusTwoForTeamA(View view) {
        displayForTeamA(2);
    }

    public void freeThrowTeamA(View view) {
        displayForTeamA(1);
    }

    public void plusThreeForTeamB(View view) {
        displayForTeamB(3);
    }

    public void plusTwoForTeamB(View view) {
        displayForTeamB(2);
    }

    public void freeThrowTeamB(View view) {
        displayForTeamB(1);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamB(0);
        displayForTeamA(0);
    }

    private void displayForTeamA(int score) {
        teamAScore = teamAScore + score;
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(teamAScore));

    }

    private void displayForTeamB(int score) {
        teamBScore = teamBScore + score;
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBScore));

    }
}
