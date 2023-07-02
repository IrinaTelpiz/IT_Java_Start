package L2HW_Java_Control_Statements_Telpiz_Irina;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {

        int num;

        System.out.print("Enter a number: ");

        Scanner numSc = new Scanner(System.in);

        num = numSc.nextInt();

        //Форматируем вывод с помощью printf()
        // Указали минимальную длину строки,
        // выровнив ее по правому краю

        if ((num%2) == 0)
//            System.out.println("It is an even number.");
            System.out.printf("%35s","It is an even number.");
        else
//            System.out.println("It is an odd number.");
            System.out.printf("%34s","It is an odd number.");
    }
}
