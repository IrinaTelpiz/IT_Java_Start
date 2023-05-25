package Homeworks.L1HW_Java_Telpiz_Irina;


import java.util.Scanner;

public class YourWeightOnTheMoon {
    public static void main(String[] args) {

        double weight;
        double moonWeight;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        weight = input.nextDouble();

        moonWeight = 17 / weight;
        System.out.println("Your weight on the moon is equal to: " + moonWeight + " kg");
    }
}
