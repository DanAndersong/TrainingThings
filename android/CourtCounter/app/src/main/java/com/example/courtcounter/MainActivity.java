package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Team teamA;
    Team teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA = new Team(findViewById(R.id.score_team_a_view));
        teamB = new Team(findViewById(R.id.score_team_b_view));
    }

    public void incrementScore(View view) {
        Button button = (Button) view;
        String points = button.getText().toString();
        String teamId = getTeamId(view);

        if (teamId.equals("team_a")) {
            addPoints(points, teamA);
            displayScore(teamA);
        }else {
            addPoints(points, teamB);
            displayScore(teamB);
        }
    }

    public void resetScore(View view) {
        teamA.score = 0;
        teamB.score = 0;
        displayScore(teamA);
        displayScore(teamB);
    }

    private void addPoints(String points, Team team) {
        switch (points) {
            case "+3 points": team.score += 3;break;
            case "+2 points": team.score += 2;break;
            case "freeThrow": team.score += 1;break;
        }
    }

    private String getTeamId (View view) {
        return view.getParent().toString().substring(view.getParent().toString().indexOf("id/")+3,
                view.getParent().toString().indexOf("_layout}"));
    }

    private void displayScore(Team team) {
            team.scoreView.setText(String.valueOf(team.score));
    }
}