package L5_Classes;

public class TernaryDemoDivideOnZeroException {
    public static void main(String[] args) {
        for (int i = -5; i < 6; i++){
            if (i != 0 ? true : false)
                System.out.println("100 / " + i + " is equal to " + 100 / i);
        }
    }
}
