package L1_Java_Primitives;

import java.util.Scanner;

public class Sound {
    public static void main(String[] args) {

        double distance;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter time passed between lightning and thunder of it: ");

        float time = input.nextFloat();

        distance = time * 335;

        String myString = "Distance to the place of lightning strike is ";

        System.out.println(myString + distance + " meters.");
    }
}
