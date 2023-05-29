package L2;

import java.util.Scanner;

public class GuessDoWhile {
    public static void main(String[] args) {

        Scanner myFancyScanner = new Scanner(System.in);

        char ch = 's';
        char answer;

        System.out.println("Guess the letter in diapazon a - z.");

        do {
            System.out.println("Enter it:");
            answer = myFancyScanner.nextLine().charAt(0);
                if (answer != ch & answer != 'q') {
                    System.out.print("Sorry necessary letter is located closer to ");
                    if (answer < ch)
                        System.out.println("the end of the alphabet.");
                    else System.out.println("the beginning of alphabet.");
                    System.out.println("Want to retry? If not, enter 'q'.");
                } else if (answer == ch) System.out.println("Congrats!");
                ch = myFancyScanner.nextLine().charAt(0);
            } while (answer != ch && answer != 'q');

        System.out.println("Goodbye!");
    }
}
