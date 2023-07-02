package L3_Control_statements;

public class ReturnDemo {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before return");

        if (t) {
            return;
        }

        System.out.println("This will be never printed");
    }
}
