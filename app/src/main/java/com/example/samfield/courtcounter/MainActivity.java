package com.example.samfield.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA,scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    Team A methods
//    this method add 3 to team A score Line
    public void addThreeToTeamA(View view){
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }

    //    this method add 2 to team A score Line

    public void addTwoToTeamA(View view){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    //    this method add 1 to team A score Line

    public void addOneToTeamA(View view){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    //    Team B methods
//    this method add 3 to team A score Line
    public void addThreeToTeamB(View view){
        scoreTeamB +=3;
        displayForTeamB(scoreTeamB);
    }

    //    this method add 2 to team A score Line

    public void addTwoToTeamB(View view){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }

    //    this method add 1 to team A score Line

    public void addOneToTeamB(View view){
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamA = scoreTeamB =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }
}
