package L6_Access_Modifiers;

public class StaticBlockDemo {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside the constructor");

        System.out.println("Square root of 2 is equal: " + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is equal: " + StaticBlock.rootOf3);
    }
}
