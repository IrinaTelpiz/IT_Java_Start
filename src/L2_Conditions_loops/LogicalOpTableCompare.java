package L2_Conditions_loops;

public class LogicalOpTableCompare {
    public static void main(String[] args) {

        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p&q)+ "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q)+ "\t" + boolToInt(!p));

        q = false;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p&q)+ "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q)+ "\t" + boolToInt(!p));

        p = false;
        q = true;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p&q)+ "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q)+ "\t" + boolToInt(!p));

        q = false;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p&q)+ "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q)+ "\t" + boolToInt(!p));

    }

    static int boolToInt(boolean b) {
        return Boolean.compare(b, false);
    }
}
