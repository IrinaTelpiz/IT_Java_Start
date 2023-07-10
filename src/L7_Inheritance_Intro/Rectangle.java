package L7_Inheritance_Intro;

public class Rectangle extends TwoDimensionShape{

    Rectangle(double width, double height) {

        super(width, height);
    }

    boolean isSquare(){
        return (width) == height ? true : false;
    }

    double area(){
        return width * height;
    }

    @Override
    void showDim() {
        System.out.println("width and height: "  + width + "&" + height);
    }
}
