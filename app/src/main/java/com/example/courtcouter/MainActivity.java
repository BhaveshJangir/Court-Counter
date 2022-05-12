package com.example.courtcouter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int pointA = 0;
    int pointB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addThreePoint(View view){
        pointA = pointA + 3;
        display(pointA);
    }
    public void addTwoPoint(View view){
        pointA = pointA + 2;
        display(pointA);
    }
    public void addOnePoint(View view){
        pointA = pointA + 1;
        display(pointA);
    }

    private void display(int point){
        TextView score = (TextView) findViewById(R.id.scoreA);
        score.setText(point+" ");
    }
    public void addThreePointB(View view){
        pointB = pointB + 3;
        displayB(pointB);
    }
    public void addTwoPointB(View view){
        pointB = pointB + 2;
        displayB(pointB);
    }
    public void addOnePointB(View view){
        pointB = pointB + 1;
        displayB(pointB);
    }
    private void displayB(int point){
        TextView score = (TextView) findViewById(R.id.scoreB);
        score.setText(point +" ");
    }
    public void reset(View view){
        pointA = 0;
        pointB = 0;
        display(pointA);
        displayB(pointB);
        TextView Winner = (TextView) findViewById(R.id.Winner);
        Winner.setText("");
    }
    public void finish(View view){
        if(pointA>pointB){
        displayWinner("Team A");
        }
        if(pointA<pointB){
            displayWinner("Team B");

        }
        if(pointA==pointB){
            TextView Winner = (TextView) findViewById(R.id.Winner);
            Winner.setText("Match tied");
        }
    }
    private void displayWinner(String team){
        TextView Winner = (TextView) findViewById(R.id.Winner);
        Winner.setText(team + " won the match\nCongratulations!!!!!!!!!!!");

    }

}