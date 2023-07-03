package L10_Exception_Handling;

public class RethrowDemo {
    public static void main(String[] args) {

        try{
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("FATAL ERROR! - app interrupted");
            System.out.println("Standard message: ");
            System.out.println(ex);
            System.out.print("Stack trace: ");
            ex.printStackTrace();
        } finally {
            System.out.println("This will be printed no matter what");

        }
        System.out.println("And this will be printed too!");
    }
}
