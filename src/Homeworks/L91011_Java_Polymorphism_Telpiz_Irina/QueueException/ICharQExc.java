package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QueueException;

public interface ICharQExc {
    void put(char ch) throws QueueFullException;
    char get() throws QueueEmptyException;
    void reset();
}
