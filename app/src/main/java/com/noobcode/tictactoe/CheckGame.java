package com.noobcode.tictactoe;

public class CheckGame{

    public static boolean checkGameStatus(int[][] board, int turn){
        if(checkDigonals(board, turn)){
            return true;
        }else if(checkHorizontals(board, turn)){
             return true;
        }else if(checkVerticles(board, turn)){
            return true;
        }

        return false;
    }

    public static boolean checkDigonals(int[][] board, int turn){
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == turn){
            return true;
        }else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == turn){
            return true;
        }

        return false;
    }

    public static boolean checkHorizontals(int[][] board, int turn){
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == turn){
            return true;
        }else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == turn){
            return true;
        }else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] == turn){
            return true;
        }

        return false;
    }

    public static boolean checkVerticles(int[][] board, int turn){
        if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == turn){
            return true;
        }else if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] == turn){
            return true;
        }else if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] == turn){
            return true;
        }

        return false;
    }

}
