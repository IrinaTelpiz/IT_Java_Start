package L6_Access_Modifiers;

public class CallByValues {
    public static void main(String[] args) {
        Test obj = new Test();
        Test obj1 = new Test();


        int a = 15, b = 20;

        System.out.println("a and b before call:" + a + " " + b);
        obj.noChange(a,b);
        System.out.println("a and b after call:" + a + " " + b);
        obj.a = 15;
        obj1.a = 150;
        obj.b = 20;
        obj1.b = 200;
        System.out.println("obj.a and obj.b BEFORE call:" + obj.a + " " + obj.b);
        System.out.println("obj1.a and obj1.b BEFORE call:" + obj1.a + " " + obj1.b);
        obj.change();
        System.out.println("obj.a and obj.b AFTER call:" + obj.a + " " + obj.b);
        Test.change(obj1);
    }
}
