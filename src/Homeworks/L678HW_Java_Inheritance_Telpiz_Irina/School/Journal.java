package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.School;

public class Journal {
    public static void main(String[] args) {

        Students st1 = new Students("Ivan Ivanov");
        Students st2 = new Students("Maria Petrova");

        st1.addGrade("Literature", 6);
        st1.addGrade("Literature", 7);
        st1.addGrade("Literature", 8);
        st1.addGrade("History", 7);
        st1.addGrade("History", 9);

        st2.addGrade("Literature", 10);
        st2.addGrade("Literature", 8);
        st2.addGrade("Literature", 9);
        st2.addGrade("History", 9);
        st2.addGrade("History", 10);
        st2.addGrade("History", 9);

        System.out.println("Student: " + st1.getName());
        System.out.println("Literature average: " + st1.getSubjectAvg("Literature"));
        System.out.println("History average: " + st1.getSubjectAvg("History"));
        System.out.println("Total average: " + st1.getAllGradesAvg());

        System.out.println("==========================================");

        System.out.println("Student: " + st2.getName());
        System.out.println("Literature average: " + st2.getSubjectAvg("Literature"));
        System.out.println("History average: " + st2.getSubjectAvg("History"));
        System.out.println("Total average: " + st2.getAllGradesAvg());








    }


}
