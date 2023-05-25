package Homeworks.L1HW_Java_Telpiz_Irina;


import java.util.Scanner;

public class YourWeightOnTheMoon {
    public static void main(String[] args) {

        double weight, moonWeight;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        weight = input.nextDouble();

        moonWeight = (weight * 17) / 100;
        System.out.println("Your weight on the moon is equal to: " + moonWeight + " kg");
    }
}
