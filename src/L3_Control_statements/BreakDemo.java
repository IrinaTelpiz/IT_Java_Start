package L3_Control_statements;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {

        int num;
        num = 100;
        char ch;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            if (i*i >= num) break;
            System.out.print(i + " ");
        }
        System.out.println("the loop is stopped");

        for (;;) {
            ch = in.nextLine().charAt(0);
            if (ch == 'q') break;
        }
        System.out.println("you have entered 'q' !");
    }
}
