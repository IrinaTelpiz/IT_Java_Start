package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;

import java.util.Scanner;

class Player {
    String name;
    char mark;

    Player(String name, char mark){
        this.name = name;
        this.mark = mark;
    }

    void  makeMove(){
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("Enter the row and column");
            row = input.nextInt();
            col = input.nextInt();

        } while (!isValidMove(row,col));
        TicTacToe.placeMark(row,col,mark);
    }

    boolean isValidMove(int row, int col){
        if (row >= 0 && row <= 2 && col >= 0 && col <=2){
            if (TicTacToe.board[row][col] == ' '){
                return true;
            }
        }
        return false;
    }
}
