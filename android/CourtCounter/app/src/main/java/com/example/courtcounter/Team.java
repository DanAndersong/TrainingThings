package com.example.courtcounter;

import android.widget.TextView;

public class Team {
    public int score;
    public TextView scoreView;

    public Team(TextView scoreView) {
        this.scoreView = scoreView;
    }
}
