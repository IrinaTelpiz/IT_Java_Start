package L2_Conditions_loops;

public class LogicalOpTableEasiest {
    public static void main(String[] args) {

        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");



        p = true;
        q = true;

        useTernary(p,q);

//        printLine(p, q);

//        if (p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p&q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p|q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p^q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (!p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t\n");

        q = false;

        useTernary(p,q);

//        printLine(p, q);

//        if (p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p&q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p|q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p^q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (!p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t\n");

        p = false;
        q = true;

        useTernary(p,q);

//        printLine(p, q);

//        if (p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p&q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p|q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p^q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (!p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t\n");

        q = false;

        useTernary(p,q);

//        printLine(p, q);

//        if (p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p&q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p|q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p^q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (!p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t\n");



    }

    public static void printLine(boolean p, boolean q){

//        if (p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p&q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p|q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (p^q) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t");
//        if (!p) System.out.print(1);
//        else System.out.print(0);
//        System.out.print("\t\n");

    }

    public static void useTernary(boolean p, boolean q) {
        System.out.print((p?1:0) + "\t" + (q?1:0) + "\t");
        System.out.print((p&q?1:0) + "\t" + (p|q?1:0) + "\t");
        System.out.println((p^q?1:0) + "\t" + (!p?1:0));

    }

//    static int boolToInt(boolean b) {
//        return Boolean.compare(b, false);
//    }
}
