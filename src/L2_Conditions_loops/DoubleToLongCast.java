package L2_Conditions_loops;

public class DoubleToLongCast {

    public static void main(String[] args) {

//        byte b;
//        int i;
//
//        i = 100672999;
//        b = (byte) i;
//
//        System.out.println("b & i: " + b + " " + i);

        long L;
        double D;

        D = 100672999.0;
        L = (long) D;

        System.out.println("L & D: " + L + " " + D);
    }
}