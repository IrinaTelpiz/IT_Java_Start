package L5_Classes;

public class TernaryDemoWithoutMinus {
    public static void main(String[] args) {
//condition ? statement1 : statement2

        System.out.println(absoluteValue(8));
        System.out.println(absoluteValue(-18));

    }
    public static int absoluteValue(int number){
        int absoluteValue;
        absoluteValue = number < 0 ? -number : number;
        return absoluteValue;
    }
}
