package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QueueException;

import Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QPack.ICharQ;

public class DynQueue implements ICharQ {

    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;

    }

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
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
