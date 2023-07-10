package L6_Access_Modifiers;

public class Dog {

    int age;
    String breed;
    private String name;
    char sex;
    boolean isHealthy;

//    public enum Breed{
//        SHEPERD,
//        BOXER,
//        POODLE,
//        STAFF,
//        GOLDEN_RETRIVER,
//        HUSKY
//    }



    public Dog(int age, String breed, String name, char sex) {
        this.age = age;
        this.breed = breed;
        setName(name);
        this.sex = sex;
    }

    public Dog(int age,String breed, String name, char sex, boolean isHealthy) {
        this(age, breed , name, sex);
        this.isHealthy = isHealthy;
    }
     Dog(){
        age = 1;
        name = "unknown";
        sex = 'n';
        isHealthy = true;
    }

    private void setName(String name){
//        System.out.println("Enter new name:");
//        Scanner inputName = new Scanner(System.in);
//        name = inputName.nextLine();
        if (name.length() >= 5)
        this.name = name;
        else {
            System.out.println("Sorry, the name must be at least 5 symbols or it won't be set");
            this.name = "unknown";
        }

    }

    public String getName(){
        return name;
    }


}
