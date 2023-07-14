package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.Students_File;

import java.util.Arrays;

class Master extends Student {

    private Courses course;

    private int[] grade;
    private int sum;
    private int avg;


    public enum Courses{
        DEVELOPER_JAVA,
        DEVELOPER_PYTHON,
        DEVELOPER_KOTLIN,
        ENGINEER_QA
    }

    public Master() {
    }

    public Master(String name, Courses course, int[] grade) {
        super(name);
        this.course = course;
        this.grade = grade;

    }

    public Master(String name, Courses course, int avg) {
        super(name);
        this.course = course;
        this.avg = avg;

    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    int[] getGrade() {
        return grade;
    }

    void setGrade(int[] grade){
        this.grade = grade;
    }


    void showGrades(){
        for (int i = 0; i < grade.length; i++){
            System.out.print(grade[i]+" ");
        }
    }

    void showAverage(){
        for (int i = 0; i < grade.length; i++){
            sum += grade[i];
            avg = sum/ grade.length;
        }
        System.out.println("Average grade is: " + avg);
    }

}
