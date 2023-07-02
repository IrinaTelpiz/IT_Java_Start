package L6_Access_Modifiers;

public class StaticDemoApp {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 20;
        ob2.x = 20;

        System.out.println("ob1.x & ob.2 are independent");
        System.out.println("ob1.x & ob2.x: " + ob1.x + " " + ob2.x);

        StaticDemo.y = 19;

        System.out.println("y is common");
        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());

        StaticDemo.y = 100;

        System.out.println("y is common");
        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());

        int res = StaticDemo.oneDiv(3, 1);
        ob1.iPrint();

    }

}
