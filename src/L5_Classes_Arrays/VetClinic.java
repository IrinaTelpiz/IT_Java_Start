package L5_Classes_Arrays;

import L6_Access_Modifiers.MyClass;

public class VetClinic {
    public static void main(String[] args) {

        Dog dog1 = new Dog(3, Dog.Breed.SHEPERD, "Bonny", 'F');

        dog1.isHealthy = true;

        Dog dog2 = new Dog();

        System.out.println(dog2.name);

        L6_Access_Modifiers.MyClass obj = new MyClass();

    }
}
