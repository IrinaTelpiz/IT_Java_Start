package L2_Conditions_loops;

public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 1; x < 6; x++) {
            if (x == 1) System.out.println("x is equal to one.");
            else if (x == 2) System.out.println("x is equal to two.");
            else if (x == 3) System.out.println("x is equal to three.");
            else if (x == 4) System.out.println("x is equal to four.");
            else System.out.println("x is out of diapason 1-4.");
        }
    }
}
