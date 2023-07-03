package L5_Classes_Arrays;

public class Dog {

    private Breed breed;

    int age;
    String name;
    char sex;
    boolean isHealthy;

    public enum Breed{
        SHEPERD,
        BOXER,
        POODLE,
        STAFF,
        GOLDEN_RETRIVER,
        HUSKY
    }



    public Dog(int age, Breed breed, String name, char sex) {
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.sex = sex;
    }

    public Dog(int age, Breed breed, String name, char sex,boolean isHealthy) {
        this(age, breed , name, sex);
        this.isHealthy = isHealthy;
    }
    public Dog(){
        age = 1;
        name = "unknown";
        sex = '?';
    }


}
