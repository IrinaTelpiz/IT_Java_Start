package L6_Access_Modifiers;

public class Figure {
    public static double calculateArea(int a) {
        return a * a;
    }

    public static double calculateArea(int a, int b) {
        return a * b * 2;
    }

    public static double calculateArea(double a, double b) {
        return a * b * 2;
    }

}
