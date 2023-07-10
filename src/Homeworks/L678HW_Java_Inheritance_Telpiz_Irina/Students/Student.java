package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.Students;

abstract class Student {

    private String name;

    Student(){

    }

    Student(String name){

        this.name = name;
    }


    String getName(){
        return name;
    }

    void setName(String name){
        if (name.length() > 3){
            this.name = name;
        }
        else{
            System.out.println("Sorry, name should be at least 3 symbols long!");
        }
    }
}
