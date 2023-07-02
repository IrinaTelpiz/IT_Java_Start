package L8_Inheritance;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(){
        width = height = 0.0;
    }

    TwoDShape(double width,double height){
        this.width = width;
        this.height = height;
    }

    TwoDShape(double dimension){
        width = height = dimension;
    }

    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
    }

    double getWidth(){return width;}

    double getHeight(){return height;}

    void setWidth(double width){
        this.width = width;
     }

    void setHeight(double height){
        this.height = height;
    }

    void showDim() {
        System.out.println("Width & height" + width + height);
    }
}
