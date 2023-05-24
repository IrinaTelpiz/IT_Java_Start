package L2;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {

        Scanner myFancyScanner = new Scanner(System.in);

        char ch, answer = 's';

        System.out.println("Guess the letter in diapason A - Z.");
        System.out.println("Enter it:");
        ch = myFancyScanner.nextLine().charAt(0);

        if (ch == answer) System.out.println("You are right!");
        else System.out.println("Sorry, you are wrong. Try next time!");
    }
}
