package L2;

public class ForDemo {
    public static void main(String[] args) {

        double num, squareRoot, roundError;

//        for (num = 1.0; num < 100.0; num++){
//            squareRoot = Math.sqrt(num);
//            System.out.println("Square root of " + num + " is equal to " + squareRoot);
//            roundError = num - (squareRoot * squareRoot);
//            System.out.println("Error is " + roundError);
//            System.out.println();
//        }
//
//        for (int x = 100; x < -100; x -= 5) {
//            System.out.println(x);
//        }
//
//        for (int counter = 10; counter > 5; counter++) {
//            System.out.println("this wont be printed");
//        }

        int i, j;

        for (i = 0, j = 10; i < j; i++, j--){
            System.out.println("i & j: " + i + " " + j);
        }
    }
}
