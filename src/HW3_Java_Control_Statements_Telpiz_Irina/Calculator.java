package HW3_Java_Control_Statements_Telpiz_Irina;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double num1,num2,sum,average;

        Scanner my = new Scanner(System.in);

        System.out.println("\nEnter two numbers: ");

        num1 = my.nextDouble();

        num2 = my.nextDouble();

        sum = num1 + num2;

//        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

        // Форматируем вывод с помощью printf()
        // Строку привели в верхний регистр,
        // добавили ординарные кавычки,
        // добавили символ новой строки.

        System.out.printf("'%S' %n","Sum of " +  num1 + " and " + num2 + " is " +  sum);

        average = (num1 + num2) / 2;

//        System.out.println("Average of " + num1 + " and " + num2 + " is " + average);

        // Контролируем длину десятичной части
        // Длину десятичной части среднего числа сократили до 2х символов

        System.out.printf("Average of " + num1 + " and " + num2 + " is %.2f %n", average);

        if (num1 > num2)
            System.out.println(num1 + " is greater than " + num2);
        else if (num1 < num2)
            System.out.println(num1 + " is less than " + num2);
        else
            System.out.println(num1 + " is equal to " + num2);
    }

}
