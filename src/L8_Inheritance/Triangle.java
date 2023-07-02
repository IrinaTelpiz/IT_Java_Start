package L8_Inheritance;

public class Triangle extends TwoDShape {
    private String style;

//    Triangle(){
//        super();
//        style = "none";
//    }

    Triangle(String style, double width, double height){
        super(width, height);
        this.style = style;
    }

}
