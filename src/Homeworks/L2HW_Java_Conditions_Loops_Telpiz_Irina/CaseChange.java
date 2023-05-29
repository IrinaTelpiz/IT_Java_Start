package Homeworks.L2HW_Java_Conditions_Loops_Telpiz_Irina;

import java.io.IOException;

public class CaseChange {
    public static void main(String[] args) throws IOException {

        char ch;
        int CountChanges = 0;

        System.out.println("\nEnter characters with different case.\nEnter \".\" to stop!");

        do {
            ch = (char) System.in.read();
            if (ch >= 'A' & ch <= 'Z'){
                ch +=32;
                CountChanges++;
                System.out.print(ch);
            }
            else if (ch >= 'a' & ch <= 'z'){
                ch -=32;
                CountChanges++;
                System.out.print(ch);
            }
            else if  (ch == '.')
                break;
            else
                System.out.print(ch);
        }
        while (ch != '.');

        System.out.println("The number of characters for witch the case has been changed is: " + CountChanges);
    }
}
