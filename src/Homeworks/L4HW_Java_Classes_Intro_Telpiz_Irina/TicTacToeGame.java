package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;


public class TicTacToeGame {
    public static void main(String[] args) {

        System.out.println("Start the game!\n" +
                "Enter number of the row and the colum (from 0 to 2)\nseparated by space! (Example: 1 0)");
        TicTacToe t = new TicTacToe();

        Player p1 = new Player("Player 1", 'X');
        Player p2 = new Player("Player 2", 'O');

        Player current;
        current = p1;

        while (true){
            System.out.println(current.name + " make a move!");
            current.makeMove();
            TicTacToe.displayBoard();

            if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagonalWin()){
                System.out.println(current.name + " IS A WINNER!!!");
                break;
            } else {
                if (current == p1){
                    current = p2;
                } else {
                    current = p1;
                }
            }
        }
    }
}
