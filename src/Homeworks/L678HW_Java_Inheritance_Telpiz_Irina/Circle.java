package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina;

class Circle extends TwoDShape {

    Circle(double radius) {
        super(radius);
    }

    double area(){
        return Math.PI * (radius * radius);
    }
}
