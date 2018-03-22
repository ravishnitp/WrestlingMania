package com.example.ravishkumar.wrestlingmania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;

    TextView result,displayPlayerA,displayPlayerB;
    Button btnA3,btnA2,btnA1,btnAP,btnB3,btnB2,btnB1,btnBP;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        displayPlayerA = (TextView) findViewById(R.id.score_player_a);
        displayPlayerB = (TextView) findViewById(R.id.score_player_b);

        //for button of player a

        btnA3 = (Button) findViewById(R.id.btnA3);
        btnA2 = (Button) findViewById(R.id.btnA2);
        btnA1 = (Button) findViewById(R.id.btnA1);
        btnAP = (Button) findViewById(R.id.btnAP);

        // for button of player b

        btnB3 = (Button) findViewById(R.id.btnB3);
        btnB2 = (Button) findViewById(R.id.btnB2);
        btnB1 = (Button) findViewById(R.id.btnB1);
        btnBP = (Button) findViewById(R.id.btnBP);

        displayScoreForPlayerA(0);
        displayScoreForPlayerB(0);
    }

    /**
     * @param scorePlayerA takes score of PlayerA and display it
     */

    public void displayScoreForPlayerA(int scorePlayerA) {
        String message = "" + scorePlayerA;
        displayPlayerA.setText(message);
    }


    //SCORE UPDATE FOR TEAM A
    public void addThreePointsToA(View view) {
        scorePlayerA += 3;
        displayScoreForPlayerA(scorePlayerA);
    }

    public void addTwoPointsToA(View view) {
        scorePlayerA += 2;
        displayScoreForPlayerA(scorePlayerA);
    }

    public void addOnePointsToA(View view) {
        scorePlayerA += 1;
        displayScoreForPlayerA(scorePlayerA);
    }

    public void addPenaltyToA(View view) {
        scorePlayerB += 2;
        displayScoreForPlayerB(scorePlayerB);
    }

    //SCORE UPDATE and view  FOR player B

    /**
     * @param scorePlayerB takes score of PlayerB and display it
     */

    public void displayScoreForPlayerB(int scorePlayerB) {
        String message = "" + scorePlayerB;
        displayPlayerB.setText(message);
    }

    public void addThreePointsToB(View view) {
        scorePlayerB += 3;
        displayScoreForPlayerB(scorePlayerB);
    }

    public void addTwoPointsToB(View view) {
        scorePlayerB += 2;
        displayScoreForPlayerB(scorePlayerB);
    }

    public void addOnePointsToB(View view) {
        scorePlayerB += 1;
        displayScoreForPlayerB(scorePlayerB);
    }

    public void addPenaltyToB(View view) {
        scorePlayerA += 2;
        displayScoreForPlayerA(scorePlayerA);
    }

    /**
     * @return message about result of match
     */

    public String result() {
        String message = "";
        if (scorePlayerA > scorePlayerB) {
            message += "Player A Won The Match";
        } else if (scorePlayerA < scorePlayerB) {
            message += "Player B Won The Match";
        } else {
            message += "Match Drawn";
        }
        return message;
    }

    /**
     * It displays result and disable all score buttons
     *
     * @param view activates on click of eendMatch button
     */
    public void endMatch(View view) {
        Button btn = (Button) findViewById(R.id.end_match);
        String message = "";
        message += result();
        btn.setVisibility(View.INVISIBLE);
        result.setText(message);
        result.setVisibility(View.VISIBLE);
        //Disable all buttons
        btnA3.setEnabled(false);
        btnA2.setEnabled(false);
        btnA1.setEnabled(false);
        btnB3.setEnabled(false);
        btnB2.setEnabled(false);
        btnB1.setEnabled(false);
        btnAP.setEnabled(false);
        btnBP.setEnabled(false);
    }

    /**
     * it resets score of both players and enable scoring buttons
     *
     * @param view for end_match button
     */

    public void resetScore(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayScoreForPlayerA(0);
        displayScoreForPlayerB(0);
        Button btn = (Button) findViewById(R.id.end_match);
        result.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);
        //ENABLE ALL BUTTONS
        btnA3.setEnabled(true);
        btnA2.setEnabled(true);
        btnA1.setEnabled(true);
        btnB3.setEnabled(true);
        btnB2.setEnabled(true);
        btnB1.setEnabled(true);
        btnAP.setEnabled(true);
        btnBP.setEnabled(true);
    }

}
