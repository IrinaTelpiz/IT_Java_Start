package L6_Access_Modifiers;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.setAlpha(6);

        obj.beta = 10000;
        obj.gamma = 500;

        System.out.println(obj.getAlpha());

//        var myDog = new Dog(" ");
        var myDog1 = new Dog();

//        myDog1.setName(" ");

//        System.out.println("After change name is: "+ myDog.getName());
        System.out.println("MyDog1 name is: " + myDog1.getName());



//        System.out.println("Default name was: " + myDog.getName());
//
//        myDog.setName();
//
//        System.out.println("After change name is: " + myDog.getName());
    }
}
