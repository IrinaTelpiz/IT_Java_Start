package L5_Classes;

public class Dog {

    int age;
    String breed;
    String name;
    char sex;
    boolean isHealthy;



    public Dog(int age, String breed, String name, char sex) {
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.sex = sex;
    }

    public Dog(int age, String breed, String name, char sex,boolean isHealthy) {
        this(age, breed, name, sex);
        this.isHealthy = isHealthy;
    }
    Dog(){
        age = 1;
        name = "unknown";
        sex = '?';
    }


}
