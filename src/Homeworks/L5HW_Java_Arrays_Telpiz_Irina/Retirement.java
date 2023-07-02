package Homeworks.L5HW_Java_Arrays_Telpiz_Irina;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {


        Scanner inputSex = new Scanner(System.in);
        Scanner inputAge = new Scanner(System.in);
        int age;
        char sex;

        do {
            System.out.println("Enter F if you are Female, enter M if you are Male.\nPress Q if you want to STOP!");
            sex = inputSex.nextLine().charAt(0);
            if (sex !='Q'| sex=='F' | sex=='M'){
                System.out.println("Enter your age please: ");
                age = inputAge.nextInt();
                if (sex == 'F'){
                    if (age < 65){
                        System.out.println((65 - age) + " years left until retirement\n");
                    }
                    if (age > 65){
                        System.out.println("You have been retired for " + (age - 65) + " years.\n");
                    }
                    if (age == 65) {
                        System.out.println("Time to retire!\n");
                    }
                }
                if (sex == 'M'){
                    if (age < 70){
                        System.out.println((70 - age) + " years left until retirement\n");
                    }
                    if (age > 70){
                        System.out.println("You have been retired for " + (age - 70) + " years.\n");
                    }
                    if (age == 70) {
                        System.out.println("Time to retire!\n");
                    }
                }
            }
        } while (sex !='Q');
        System.out.println("Goodbye!");
    }
}
