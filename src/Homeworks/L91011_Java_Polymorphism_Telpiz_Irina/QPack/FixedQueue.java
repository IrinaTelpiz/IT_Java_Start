package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QPack;

public class FixedQueue implements ICharQ {

    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1){
            System.out.println(" - Queue is full.");
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get(){
    if (getloc == putloc){
        System.out.println(" - Queue is empty.");
        return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    @Override
    public void reset() {
        putloc = getloc = 0;
    }
}

