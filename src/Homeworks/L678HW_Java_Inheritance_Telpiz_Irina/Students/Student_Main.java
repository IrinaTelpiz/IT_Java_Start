package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.Students;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Student_Main{
    public static void main(String[] args) {

        Master sM1 = new Master("Ivanov Ivan",Master.Courses.DEVELOPER_PYTHON,new int[]{6,8,9,7,8,8,10});
        Bachelor sB1 = new Bachelor("Petrova Maria",Bachelor.Courses.QA_MANUAL,new int[]{5,6,10,7,9});


        System.out.println("Course Master: " + sM1.getCourse() + "\nStudent: " + sM1.getName());
        System.out.print("Grades: ");
        sM1.showGrades();
        System.out.println();
        sM1.showAverage();
        System.out.println();

        System.out.println("Course Bachelor: " + sB1.getCourse() + "\nStudent: " + sB1.getName());
        System.out.print("Grades: ");
        sB1.showGrades();
        System.out.println();
        sB1.showAverage();
        System.out.println();


        try {
            File myObj = new File("D:\\JAVA\\HOME-WORK\\Students_Grades.txt");
            if (myObj.createNewFile()){
                System.out.println("File created: "+ myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException exc){
            System.out.println("An error occurred.");
            exc.printStackTrace();
        }


        try {
            FileWriter myWrites = new FileWriter("D:\\JAVA\\HOME-WORK\\Students_Grades.txt");
            myWrites.write("Student: " + sM1.getName() + "\nCourse: " + sM1.getCourse() + "\nGrades: " + Arrays.toString(sM1.getGrade()));
            myWrites.write("\n\nStudent: " + sB1.getName() + "\nCourse: " + sB1.getCourse() + "\nGrades: " + Arrays.toString(sB1.getGrade()));
            myWrites.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {
            File myObj = new File("D:\\JAVA\\HOME-WORK\\Students_Grades.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }




    }
}
