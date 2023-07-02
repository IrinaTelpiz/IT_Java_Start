package Homeworks.L5HW_Java_Arrays_Telpiz_Irina;

import java.util.Scanner;

public class StudentsAndGrades {
    public static void main(String[] args) {

        Scanner inputGrade = new Scanner(System.in);


        double avgGrade;
        int sumGrades = 0;
        int[] students = new int[3];

        System.out.println("Enter grades of 3 students!\n");


        do {
            for (int i = 0; i < 3; i++){
                System.out.println("Enter a grade of student " + (i+1) );
                students[i] = inputGrade.nextInt();

            }
            for (int i = 0; i < 3; i++) {
                System.out.println("Grade of student " + (i + 1) + " is " + students[i]);
                sumGrades += students[i];
            }
            avgGrade = ((double) sumGrades / students.length);
            System.out.println("\nAverage grade of group is: " + avgGrade );
        }
        while (students.length<3);
    }
}
