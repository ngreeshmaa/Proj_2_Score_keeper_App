package com.example.ins15.score_keeper_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Score of team India
    int scoreIndia=0;

    //Score of team Australia
    int scoreAustralia=0;

    //No. of wickets of India
    int wicketIndia=0;

    //No. of wickets of Australia;
    int wicketAustralia=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Adds one run to score of team India*/
    public void addOneRunIndia(View v){
        scoreIndia=scoreIndia + 1;
        displayIndiaScore(scoreIndia);
    }

    /*Adds four runs to score of team India*/
    public void addFourRunsIndia(View v){
        scoreIndia=scoreIndia + 4;
        displayIndiaScore(scoreIndia);
    }

    /*Adds six runs to score of team India*/
    public void addSixRunsIndia(View v){
        scoreIndia=scoreIndia + 6;
        displayIndiaScore(scoreIndia);
    }

    /*Increases wicket of team India by one*/
    public void outIndia(View v){
        if(wicketIndia==10){
            Toast.makeText(this, "No wicket left", Toast.LENGTH_LONG).show();
            return ;
        }
        wicketIndia=wicketIndia + 1;
        displayIndiaWickets(wicketIndia);
    }

    /*Adds one run to score of team Australia*/
    public void addOneRunAustralia(View v){
        scoreAustralia=scoreAustralia + 1;
        displayAustraliaScore(scoreAustralia);
    }

    /*Adds four runs to score of team Australia*/
    public void addFourRunsAustralia(View v){
        scoreAustralia=scoreAustralia + 4;
        displayAustraliaScore(scoreAustralia);
    }

    /*Adds six runs to score of team Australia*/
    public void addSixRunsAustralia(View v){
        scoreAustralia=scoreAustralia + 6;
        displayAustraliaScore(scoreAustralia);
    }

    /*Increases wicket of team Australia by one*/
    public void outAustralia(View v){
        if(wicketAustralia==10){
            Toast.makeText(this, "No wicket left", Toast.LENGTH_LONG).show();
            return;
        }
        wicketAustralia=wicketAustralia + 1;
        displayAustraliaWickets(wicketAustralia);
    }

    /*Resets the value of runs and wickets of both the teams*/
    public void reset(View v){
        scoreIndia=0;
        scoreAustralia=0;
        wicketAustralia=0;
        wicketIndia=0;
        displayIndiaWickets(wicketIndia);
        displayAustraliaScore(scoreAustralia);
        displayAustraliaWickets(wicketAustralia);
        displayIndiaScore(scoreIndia);
    }

    /*Display the total runs of team India*/
    public void displayIndiaScore(int scoreIndia) {
        TextView runs=(TextView) findViewById(R.id.score_india);
        runs.setText(String.valueOf(scoreIndia));
    }

    /*Display the total runs of team Australia*/
    private void displayAustraliaScore(int scoreAustralia) {
        TextView runs= (TextView) findViewById(R.id.score_australia);
        runs.setText(String.valueOf(scoreAustralia));
    }

    /*Display the total wickets of team India*/
    private void displayIndiaWickets(int wicketIndia) {
        TextView wickets= (TextView) findViewById(R.id.wickets_india);
        wickets.setText(String.valueOf(wicketIndia));
    }

    /*Display the total wickets of team Australia*/
    private void displayAustraliaWickets(int wicketAustralia) {
        TextView wickets=(TextView) findViewById(R.id.wicket_australia);
        wickets.setText(String.valueOf(wicketAustralia));
    }

    public void finish(View v){
        if (scoreIndia==scoreAustralia){
            Toast.makeText(this, "TIE!!!", Toast.LENGTH_LONG).show();
        }
        else if(scoreAustralia>scoreIndia) {
            Toast.makeText(this, "AUSTRALIA WON !", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "INDIA WON !", Toast.LENGTH_SHORT).show();
        }
    }
}