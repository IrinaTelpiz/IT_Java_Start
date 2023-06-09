package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QPack;

public class CircularQueue implements ICharQ {

    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Queue is full.");
            return;
        }
        putloc++;
        if (putloc == q.length) putloc = 0;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }

    @Override
    public void reset() {
        putloc = getloc = 0;
    }
}
