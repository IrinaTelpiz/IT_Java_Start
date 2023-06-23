package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;


public class TicTacToeGame {
    public static void main(String[] args) {

        System.out.println("Start the game!");


        TicTacToe game = new TicTacToe();

        game.displayBoard();



        System.out.println(game.ifDiagonalWin());
        System.out.println(game.ifRowWin());
        System.out.println(game.ifColumnWin());




    }
}
