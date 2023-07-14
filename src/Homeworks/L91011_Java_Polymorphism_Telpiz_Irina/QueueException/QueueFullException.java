package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QueueException;

class QueueFullException extends Exception{

    int size;

    QueueFullException(int s){
        size = s;
    }


    public String toString() {
        return "\nQueue is full. Maximum size of Queue is: " + size;
    }
}
