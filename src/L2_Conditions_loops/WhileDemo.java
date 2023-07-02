package L2_Conditions_loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

//        char ch;
//        ch = 'a';
//
//        System.out.println("\n\n With while:");
//        while (ch <= 'z') {
//            System.out.print(ch);
//            ++ch;
//        }
//
//        System.out.println("\n\n With for:");
//        for (ch = 'a'; ch <= 'y'; ++ch) {
//            System.out.print(ch);
//        }
//
//        System.out.println("\n\n With do while:");
//        do {
//            System.out.print(ch);
//            ch--;
//        } while (ch >= 'a');
//
//        System.out.println();
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter condition: ");
//        boolean condition = in.nextBoolean();
//
//        int m = 0;
//
//        while (m > 0) {
//            System.out.println("Print it with while");
//            m -= 1;
//        }
//
//        int n = 0;
//
//        do {
//            System.out.println("Print it with do while");
//            n -= 1;
//        } while (n > 0);

        Scanner in = new Scanner(System.in);

        char ch;

        do {
            System.out.println("Enter value of ch: ");
            ch = in.nextLine().charAt(0);
        } while (ch != 'q');
    }
}
