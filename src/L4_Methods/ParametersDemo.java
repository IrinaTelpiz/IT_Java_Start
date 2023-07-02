package L4_Methods;

public class ParametersDemo {

    public static void main(String[] args) {

        CheckNumber e = new CheckNumber();

        if (CheckNumber.isEven(10)) System.out.println("10 is even");
        if (CheckNumber.isEven(9)) System.out.println("9 is even");
        if (CheckNumber.isEven(8)) System.out.println("8 is even");
        if (CheckNumber.isFactor(2, 8)) System.out.println("2 is factor of 8");
        if (CheckNumber.isFactor(3, 10)) System.out.println("3 is factor of 10");
        if (CheckNumber.isFactor(10,10000)) System.out.println("10 is factor of 10000");
    }

}
