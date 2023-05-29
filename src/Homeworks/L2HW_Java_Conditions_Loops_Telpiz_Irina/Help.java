package Homeworks.L2HW_Java_Conditions_Loops_Telpiz_Irina;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {

        char choice;

        System.out.println("Reference:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Choose: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Operator if:\n");
                System.out.println("if (condition) operator;");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("Operator switch:\n");
                System.out.println("switch (expression) {");
                System.out.println(" case constant:");
                System.out.println(" sequence of operators");
                System.out.println(" break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Request not found.");
        }
    }
}
