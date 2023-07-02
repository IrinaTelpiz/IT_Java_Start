package L4_Methods;

import java.util.Scanner;

public class SayHelloDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        String result = constructHelloSentence(name, 18);
//        System.out.println(result);

//        String name1 = "Johny";
//        constructHelloSentence(name1);
//        String name2 = "Mary";
//        constructHelloSentence(name2);
//        String name3 = "Lucy";
//        constructHelloSentence(name3);
//        constructHelloSentence("Jamie");

    }
    public static String constructHelloSentence(String name, int age){
        String resultSentence = "Hello world! My name is " + name + "! I am " + age + " years old.";
        System.out.println(resultSentence);
        return resultSentence;
    }
}
