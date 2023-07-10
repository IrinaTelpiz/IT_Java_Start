package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.Students;

class Bachelor extends Student {

    private Courses course;

    private int[] grade;
    private int sum;
    private int avg;


    public enum Courses{
        JAVA,
        PYTHON,
        KOTLIN,
        QA_MANUAL
    }

    public Bachelor() {
    }

    public Bachelor(String name, Bachelor.Courses course, int[] grade) {
        super(name);
        this.course = course;
        this.grade = grade;

    }

    public Bachelor(String name, Bachelor.Courses course, int avg) {
        super(name);
        this.course = course;
        this.avg = avg;

    }

    public Bachelor.Courses getCourse() {
        return course;
    }

    public void setCourse(Bachelor.Courses course) {
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
