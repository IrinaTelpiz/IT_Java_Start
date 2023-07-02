package Homeworks.L5HW_Java_Arrays_Telpiz_Irina;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner inputPrices = new Scanner(System.in);

        int[] products = new int[5];
        int sum = 0;

        System.out.println("Enter prices of 5 products that you bought.\n");

        do {
            for (int i = 0; i<5;i++){
                System.out.println("Enter price of product number: " + (i+1));
                products[i] = inputPrices.nextInt();
            }
            for (int i = 0; i<5;i++){
                sum += products[i];

            }
        }while(products.length<5);

        System.out.println("Total price without discount is: " + sum + "\n");

        if (sum > 1000 & sum <= 10000){
            System.out.println("You must pay: " + (sum-(sum * 0.10)) + "\n"
                    + "Congratulations! You saved " + sum * 0.10 + " $ with 10% discount");
        }
        if (sum > 10000) {
            System.out.println("You must pay: " + (sum-(sum * 0.20)) + "\n"
                    + "Congratulations! You saved " + sum * 0.20 + " $ with 20% discount");
        }
        if(sum <= 1000){
            System.out.println("You need to spend " + (1001-sum) + " $ to get the discount.");
        }


    }

}
