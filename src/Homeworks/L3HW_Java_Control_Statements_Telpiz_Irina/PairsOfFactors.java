package HW3_Java_Control_Statements_Telpiz_Irina;

import java.util.Scanner;

public class PairsOfFactors {
    public static void main(String[] args) {

        int num;
        int x;
        int quit = 1;

        Scanner number = new Scanner(System.in);

        System.out.println("\nFor exit press 1");

        do {
            System.out.print("\nEnter a number: ");

            num = number.nextInt();

            if (num==quit)
                System.out.println("\nGoodbye!");

            // с частью кода где сообщение выводится не справилась, 4 дня перебирала варианты,
            // оставила наиболее близкий вариант к правде, остальные еще хуже себя вели :(,
            // самой очень интересно как сделать его правильно рабочим

            else {
                for (x = 2; x * x <= num;){
                    if (num%x != 0){
                        System.out.println("\nThe number " + num + " has no multipliers, so it is a prime number." +
                                           "\nA prime number (or a prime) is a natural number greater than 1" +
                                           "\nthat is not a product of two smaller natural numbers.");
                    }
                    else
                        System.out.println ( "\n" + num + " is a product of:");
                        for (x = 2; x * x <= num; x++ ){
                            if ((num%x) == 0)  {
                                System.out.println(x + " and " + num / x);
                        }
                    }
                }
            }
        } while (num != quit) ;
    }
}
