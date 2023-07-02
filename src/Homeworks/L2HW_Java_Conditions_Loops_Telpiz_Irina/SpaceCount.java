package Homeworks.L2HW_Java_Conditions_Loops_Telpiz_Irina;

import java.io.IOException;

public class SpaceCount {
    public static void main(String[] args) throws IOException {

        char ch;
        int countSpaces = 0;

        System.out.println("\nEnter characters.\nEnter \".\" to stop!");

        do {
            ch = (char) System.in.read();
            if (ch == ' '){
                countSpaces++;
            }
        }
        while (ch != '.');

        System.out.println("\nNumber of spaces: " + countSpaces);

    }
}
