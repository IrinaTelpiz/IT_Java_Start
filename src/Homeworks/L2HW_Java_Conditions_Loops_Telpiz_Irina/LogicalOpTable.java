package Homeworks.L2HW_Java_Conditions_Loops_Telpiz_Irina;

public class LogicalOpTable {
    public static void main(String[] args) {

        boolean p, q;

//        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

//        p = true; q = true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
//
//        p = true; q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
//
//        p = false; q = true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
//
//        p = false; q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        if (p) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p&q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p|q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p^q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (!p) System.out.println("1");
        else System.out.println("0");

        p = true; q = false;
        if (p) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p&q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p|q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p^q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (!p) System.out.println("1");
        else System.out.println("0");

        p = false; q = true;
        if (p) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p&q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p|q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p^q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (!p) System.out.println("1");
        else System.out.println("0");

        p = false; q = false;
        if (p) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p&q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p|q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (p^q) System.out.print("1" + "\t");
        else System.out.print("0" + "\t");
        if (!p) System.out.println("1");
        else System.out.println("0");

    }
}
