package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.Students;

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







    }
}
