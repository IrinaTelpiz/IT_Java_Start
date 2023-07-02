package L7_Inheritance_Intro;

public class ShapeDemo {
    public static void main(String[] args) {
        TwoDimensionShape twoDShape = new TwoDimensionShape(24,25);
        Triangle t1 = new Triangle(2,3,"transparent");
        Triangle t2 = new Triangle(3,7,"colored");
        Rectangle r1 = new Rectangle(20,3);

        t1.style = "transparent";
        t1.width = 2;
        t1.height = 3;

        t2.style = "colored";
        t2.width = 3;
        t2.height = 7;


        r1.width = 20;
        r1.height = 30;

        System.out.println("info about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("area of t1: " + t1.area());

        System.out.println("info about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("area of t1: " + t2.area());

        System.out.println("info about r1: ");

        r1.showDim();
        System.out.println("area of t1: " + t1.area());
    }
}
