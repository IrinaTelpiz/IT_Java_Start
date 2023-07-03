package L10_Exception_Handling;

public class SubclassException {
    public static void main(String[] args) {

        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num.length; i++){
            try {
                System.out.println(num[i] + "/" + denom[i] + " = " + num[i] / denom[i]);
            } catch (NullPointerException exc)
            {System.out.println("Out of bounds exception has occurred! " + exc.getMessage());
                exc.printStackTrace();
            } catch (Throwable exc){
                System.out.println("Exception has occurred! " + exc.getMessage());
                exc.printStackTrace();
            }
        }
    }
}
