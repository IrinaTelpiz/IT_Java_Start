package L5_Classes;

public class VetClinic {
    public static void main(String[] args) {

        Dog dog1 = new Dog(3, "Shepard", "Bonny", 'F');

        dog1.isHealthy = true;

        Dog dog2 = new Dog();

        System.out.println(dog2.name);
    }
}
