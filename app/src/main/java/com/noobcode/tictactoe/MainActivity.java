package com.noobcode.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView nounce;
    private Button b00;
    private Button b01;
    private Button b02;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b20;
    private Button b21;
    private Button b22;
    private Button restart;
    public int[][] board;
    private int turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();

    }

    private void initUi() {

        board = new int[3][3];

        b00 = (Button) findViewById(R.id.b00);
        b01 = (Button) findViewById(R.id.b01);
        b02 = (Button) findViewById(R.id.b02);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        restart = (Button) findViewById(R.id.restart);
        nounce = (TextView) findViewById(R.id.nounce);

        restart.setOnClickListener(this);
        b00.setOnClickListener(this);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.restart:{
                turn = 1;
                nounce.setText("Player " + turn + " Turn");
                cleanBoard();
                break;
            }
            case R.id.b00:{
                if(checkPlace(0, 0)){
                    b00.setText(turn+"");
                    board[0][0] = turn;
                 if(CheckGame.checkGameStatus(board, turn)){
                     Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                     turn = 1;
                     cleanBoard();
                 }
                 changeTurn();
                }
                break;
            }
            case R.id.b01:{
                if(checkPlace(0, 1)){
                    b01.setText(turn+"");
                    board[0][1] = turn;
                    if(CheckGame.checkGameStatus(board, turn)){
                        Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                        turn = 1;
                        cleanBoard();
                    }
                    changeTurn();
                }
                break;
            }
            case R.id.b02:{
                if(checkPlace(0, 2)){
                    b02.setText(turn+"");
                    board[0][2] = turn;
                    if(CheckGame.checkGameStatus(board, turn)){
                        Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                        turn = 1;
                        cleanBoard();
                    }
                    changeTurn();
                }
                break;
            }
            case R.id.b10:{
                if(checkPlace(1, 0)){
                    b10.setText(turn+"");
                    board[1][0] = turn;
                    if(CheckGame.checkGameStatus(board, turn)){
                        Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                        turn = 1;
                        cleanBoard();
                    }
                    changeTurn();
                }
                break;
            }
            case R.id.b11:{
                if(checkPlace(1, 1)){
                    b11.setText(turn+"");
                    board[1][1] = turn;
                    if(CheckGame.checkGameStatus(board, turn)){
                        Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                        turn = 1;
                        cleanBoard();
                    }
                    changeTurn();
                }
                break;
            }
            case R.id.b12:{
                if(checkPlace(1, 2)){
                    b12.setText(turn+"");
                    board[1][2] = turn;
                    if(CheckGame.checkGameStatus(board, turn)){
                        Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                        turn = 1;
                        cleanBoard();
                    }
                    changeTurn();
                }
                break;
            }
            case R.id.b20:{
                if(checkPlace(2, 0)){
                    b20.setText(turn+"");
                    board[2][0] = turn;
                    if(CheckGame.checkGameStatus(board, turn)){
                        Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                        turn = 1;
                        cleanBoard();
                    }
                    changeTurn();
                }
                break;
            }
            case R.id.b21:{
                if(checkPlace(2, 1)){
                    b21.setText(turn+"");
                    board[2][1] = turn;
                    if(CheckGame.checkGameStatus(board, turn)){
                        Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                        turn = 1;
                        cleanBoard();
                    }
                    changeTurn();
                }
                break;
            }
            case R.id.b22:{
                if(checkPlace(2, 2)){
                    b22.setText(turn+"");
                    board[2][2] = turn;
                    if(CheckGame.checkGameStatus(board, turn)){
                        Toast.makeText(this, turn + " has won the game.", Toast.LENGTH_SHORT).show();
                        turn = 1;
                        cleanBoard();
                    }
                    changeTurn();
                }
                break;
            }
            default: {

            }
        }
    }

    private void cleanBoard() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = 0;
            }
        }

        b00.setText("");
        b01.setText("");
        b02.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
    }

    private void changeTurn() {
        if(turn == 1){
            turn = 2;
        }else{
            turn = 1;
        }
        nounce.setText("Player " + turn + " Turn");
    }

    private boolean checkPlace(int i, int j) {
        if(board[i][j] == 0){
            return true;
        }

        return false;
    }


}
