package L8_Inheritance;

public class OrderOfConstructorsDemo {
    public static void main(String[] args) {
//        C myC = new C();
//
//        X x = new X(5);
//        X x2;
//
//        Y y = new Y(10,4);
//
//        x2 = x;
//        System.out.println("x2.a: " + x2.a);
//        x2 = y;
//        System.out.println("x2.a: " + x2.a);
//
//        x2.a = 19;
//        x2.b = 27; x2 is ob type X, b is NOT an instance variable of class X

        Sup obOfSuper = new Sup();
        Sub1 obOfSubclass1 = new Sub1();
        Sub2 obOfSubClass2 = new Sub2();

        Sup superClassObRef;

        superClassObRef = obOfSuper;
        superClassObRef.who();
        superClassObRef = obOfSubclass1;
        superClassObRef.who();
        superClassObRef = obOfSubClass2;
        superClassObRef.who();

    }
}
