package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;

public class TextEditorMain {

    public static void main(String[] args) {

        TextEditor newString = new TextEditor();
        newString.start = "Hello, tell me something about yourself. ";

        System.out.println();

        newString.addString("\tI don't want...\n");

        newString.addString("\tMy name is Irina.", "\tI am from Moldova.\n");
    }

}
