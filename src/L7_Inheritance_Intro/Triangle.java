package L7_Inheritance_Intro;

public class Triangle extends TwoDimensionShape {
    String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    double area() {
        return width * height / 2;
    }

    void showStyle() {

        System.out.println("The triangle is "
                + style);
    }
}
