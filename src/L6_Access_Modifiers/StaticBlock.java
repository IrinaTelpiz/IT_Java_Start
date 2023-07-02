package L6_Access_Modifiers;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Inside of a static block of code:");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock(String msg){
        System.out.println(msg);
    }
}
