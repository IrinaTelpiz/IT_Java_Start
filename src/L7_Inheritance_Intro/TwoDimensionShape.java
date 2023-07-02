package L7_Inheritance_Intro;

public class TwoDimensionShape {

    double width;
    double height;

    public double getWidth(){return width;}
    public double getHeight(){return height;}

    TwoDimensionShape(double width, double height){
        this.width = width;
        this.height = height;

    }

    public TwoDimensionShape() {

    }

     void showDim(){
        System.out.println("Wight and height: "
                + width + "and" + height);
    }
//    abstract double area();
}
