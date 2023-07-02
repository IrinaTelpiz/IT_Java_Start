package L6_Access_Modifiers;

public class Overload {
    void ovDemo(){
        System.out.println("No parameters");
    }

    void ovDemo(int a){
        System.out.println("With 1 parameter sum is equal " + a);
    }
    void ovDemo(int a, int b){
        System.out.println("With 2 parameters sum is equal" + a + b);
    }

    void ovDemo(double a, double b){
        System.out.println("With 2 parameters sum is equal" + a + b);
    }

    void ovDemo(int a, int b, int c){
        System.out.println("With 2 parameters sum is equal" + a + b + c);
    }



}
