package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;


class  TicTacToe{
    char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }
    void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[j].length; j++) {
                board[i][j] = ' ';
            }
        }
    }
    void displayBoard(){
        System.out.println("-------------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("|  ");
            for (int j = 0; j < board[j].length; j++) {
                System.out.print(board[i][j] + "  |  ");
            }
            System.out.println();
            System.out.println("-------------------");
        }
    }


}



public class Game {

    public static void main(String[] args) {

        TicTacToe t = new TicTacToe();
        t.displayBoard();

    }

}





