package L10_Exception_Handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try{
            System.out.println("Before exception occurred");
            nums[7] = 10;
            System.out.println("This wont be printed.");
        } catch (NullPointerException exc){
            System.out.println("Null pointer exception has occurred! " + exc.getMessage());
            exc.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Out of bounds exception has occurred! " + exc.getMessage());
            exc.printStackTrace();
        }
        System.out.println("After catch operator");
    }
}
