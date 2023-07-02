package L5_Classes_Arrays;

public class VetClinic {
    public static void main(String[] args) {

        Dog dog1 = new Dog(3, Dog.Breed.SHEPERD, "Bonny", 'F');

        dog1.isHealthy = true;

        Dog dog2 = new Dog();

        System.out.println(dog2.name);
    }
}
