package L10_Exception_Handling;

public class CustomExceptionDemo {
    public static void main(String[] args) {

        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 5, 4, 0, 8};

        for (int i = 0; i < num.length; i++){
            try {
                if (num[i] % denom[i] != 0)
                    throw new NonIntResultException(num[i], denom[i]);
                System.out.println(num[i] + "/" + denom[i] + " = " + num[i]/denom[i]);
            } catch (ArithmeticException exc){
                System.out.println("Arithmetic exception has occurred! " + exc.getMessage());
                exc.printStackTrace();
            } catch (NonIntResultException exc){
                System.out.println(exc);
            } catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Element not found!");
            }
        }

    }
}
