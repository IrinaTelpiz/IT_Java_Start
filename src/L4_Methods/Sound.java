package L4_Methods;


import java.util.Scanner;

public class Sound {

    public static void main(String[] args) {

        System.out.println("I'll call my method and let's see what will happen next!");

        calculateAndPrintDistance();

        double result = calculateAndReturnDistance(45);

        String my_string = "Distance, calculated by my method call, is ";
        System.out.println(my_string + result + " meters");

    }

    public static void calculateAndPrintDistance() {
        double distance;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time passed between lightning and thunder of it: ");
        float time = input.nextFloat();
        distance = time * 335;
        String myString = "Distance to the place of lightning strike is ";
        System.out.println(myString + distance + " meters.");
    }

    public static double calculateAndReturnDistance (float time){
        double distance;
        distance = time * 335;
        return distance;
    }
}
