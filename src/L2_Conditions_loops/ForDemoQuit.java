package L2_Conditions_loops;

import java.util.Scanner;

public class ForDemoQuit {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        int i = 0;
//        System.out.println("To stop enter q");
//        for (i = 0; input.nextLine().charAt(0) != 'q'; i++) {
//            System.out.println("Run nr." + i);
//        }

        for (; i < 10;){
            System.out.println("Run nr." + i);
            i++;
        }

    }
}
