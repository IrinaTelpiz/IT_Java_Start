package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.Stack;

class StackFullException extends Exception{

    int size;

    StackFullException(int s){
        size = s;
    }

    @Override
    public String toString() {
        return "\nStack is full. Maximum size is " + size;
    }
}
