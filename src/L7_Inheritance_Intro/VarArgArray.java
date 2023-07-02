package L7_Inheritance_Intro;

public class VarArgArray {
    public static void varTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contains: ");
        for (int i = 0; i < v.length; i++){
            System.out.print(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void varTest(int a, int ... v){
        System.out.println("bool was called");
    }

    static void varTest(boolean ... v){
        System.out.println("bool was called");
    }

    public static void main(String[] args) {
        varTest("One arg in an array: ", 10);
        varTest("Two arg in an array: ", 10, 2);
        varTest("No arg in an array. ");
        varTest(2, 3, 4);
        varTest(true, false, false);
        varTest();

    }
}
