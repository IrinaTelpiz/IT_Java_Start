package Homeworks.L5HW_Java_Arrays_Telpiz_Irina;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner inputScore = new Scanner(System.in);
        int score;

        System.out.println("Let's find out your grade for the exam, enter your score (0-100) please:");
        score = inputScore.nextInt();

        if (score >= 90 & score <= 100) System.out.println("A");
        if (score >= 80 & score < 90) System.out.println("B");
        if (score >= 70 & score < 80) System.out.println("C");
        if (score >= 60 & score < 70) System.out.println("D");
        if (score >= 0 & score < 60) System.out.println("F");
        if (score > 0 & score > 100) System.out.println("Sorry, incorrect data.");
    }
}
