package Homeworks.L1HW_Java_Telpiz_Irina;

import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {

        double gallons, liters;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter gallons");
        gallons = input.nextDouble();

        liters = gallons * 3.7854;
        System.out.println(gallons + " gallons are equal to " + liters + " liters.");
    }
}
