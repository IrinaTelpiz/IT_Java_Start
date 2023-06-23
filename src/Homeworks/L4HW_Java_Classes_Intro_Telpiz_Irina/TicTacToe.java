package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;

public class TicTacToe {

    char[][] board;

    public TicTacToe() {
        board = new char[3][3];
    }

    void initBoard() {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                board[x][y] = ' ';
            }
        }
    }

    void displayBoard() {
        System.out.println("-------------------");
        for (int x = 0; x < board.length; x++) {
            System.out.print("|  ");
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y] + "  |  ");
            }
            System.out.println();
            System.out.println("-------------------");
        }
    }

    void placeSymbol(int row, int column, char symbol) {
        if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
            board[row][column] = symbol;
        } else {
            System.out.println("Invalid position");
        }
    }
    boolean ifColumnWin(){
        for (int y = 0; y <= 2; y++){
            if (board[0][y] != ' ' && board[0][y] == board[1][y] &&
                    board[1][y] == board[2][y]){
                return true;
            }
        }
        return false;
    }
    boolean ifRowWin(){
        for (int x = 0; x <= 2; x++){
            if (board[x][0] != ' ' && board[x][0] == board[x][1] && board[x][1] == board[x][2]){
                return true;
            }

        }
        return false;
    }

    boolean ifDiagonalWin(){
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
        || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            return true;
        } else {
            return  false;
        }

    }

}




