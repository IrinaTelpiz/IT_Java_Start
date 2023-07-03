package L10_Exception_Handling;

public class ThrowDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Before operator THROW!");
            throw new ArithmeticException();
        } catch (ArithmeticException exc){
            System.out.println("The exception is caught.");
        }
        System.out.println("After try/catch");
    }
}
