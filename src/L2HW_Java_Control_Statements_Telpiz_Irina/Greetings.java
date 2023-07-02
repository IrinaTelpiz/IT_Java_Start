package L2HW_Java_Control_Statements_Telpiz_Irina;

import java.io.IOException;
public class Greetings {
    public static void main(String[] args) throws IOException {

        //символьный тип выбран намеренно вместо целочисленного,
        //чтобы при вводе например буквы было сообщение,
        //а не ошибка программы

        char language;

        System.out.println("Select a language to see The Greeting \"Hi!\" in it.");
        System.out.println("1. Russian");
        System.out.println("2. Spanish");
        System.out.println("3. Romanian");
        System.out.println("4. Italian");
        System.out.print("Select and enter a number: ");

        language = (char) System.in.read();

        System.out.println();

        switch (language) {
            case '1' -> System.out.println("Привет!");
            case '2' -> System.out.println("¡Hola!");
            case '3' -> System.out.println("Buna!");
            case '4' -> System.out.println("Ciao!");
            default -> System.out.println("Sorry! Request not found.");
        }
    }
}
