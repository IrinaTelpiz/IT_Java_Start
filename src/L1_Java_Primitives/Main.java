package L1_Java_Primitives;

public class Main {
    public static void main(String[] args) {
        System.out.println("Integer primitives");

        byte b = 8;
        short s = 16;
        int i; // declaring variable
        i = 32; // initializing variable
        long l = 64;

        System.out.println("\nVariables of type 'byte' store" + b + " bits.\nDiapason: from -128 to 127");
        System.out.println("\nVariables of type 'short' store" + s + " bits.\nDiapason: from -32 768 to 32 767");
        System.out.println("\nVariables of type 'int' store" + i + " bits.\nDiapason: from -2 147 483 648 to 2 147 483 647");
        System.out.println("\nVariables of type 'long' store" + l + " bits.\nDiapason: from -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807");

        System.out.println("Floating point primitives");

        float f = 0.6f;
        double d = 0.5;

        System.out.println("\nVariables of type 'float' store 32 bits.");
        System.out.println("\nVariables of type 'double' store 64 bits.");

        char c;

        c = 81;

        System.out.println("Variable c contains " + c);
        c += 1;
        System.out.println("Value of variable c after 'c += 1' =  " + c);
        c++;
        c++;
        System.out.println("Value of variable c after 'c++' =  " + c);
        System.out.println();

        System.out.println("Initial value of variable i =  " + i);
        i = i + 1;
        System.out.println("Value of variable i after 'i = i + 1' =  " + i);
        i += 1;
        System.out.println("Initial value of variable after 'i += 1 = " + i);
        i++;
        System.out.println("Initial value of variable after 'i++' = " + i);
        System.out.println();

        boolean boo;

        boo = true;

        System.out.println(boo);
        System.out.println();

        if (boo) System.out.println("boo is true");



        System.out.println("b + s = " + (b + s));
        System.out.println("b + s = " + (8 + 16));





    }
}
