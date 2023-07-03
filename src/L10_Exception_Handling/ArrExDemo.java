package L10_Exception_Handling;

public class ArrExDemo {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 0, 128};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num.length; i++){
            try {
                System.out.println(num[i] + "/" + denom[i] + " = " + num[i]/denom[i]);
            } catch (ArithmeticException e){
                try {
                    System.out.println(denom[i] + "/" + num[i] + " = " + denom[i]/num[i]);
                } catch (ArithmeticException e2){
                    System.out.println("0/0 attempt!");
                }
            }
        }
    }
}
