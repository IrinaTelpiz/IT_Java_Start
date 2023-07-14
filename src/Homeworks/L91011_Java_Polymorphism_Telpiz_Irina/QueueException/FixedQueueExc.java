package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina.QueueException;


public class FixedQueueExc implements ICharQExc {

    private char q[];
    private int putloc, getloc;

    public FixedQueueExc(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch)
            throws QueueFullException {
        if (putloc == q.length - 1)
            throw new QueueFullException(q.length - 1);

            putloc++;
            q[putloc] = ch;
        }

    @Override
    public char get()
            throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        getloc++;
        return q[getloc];
    }

    @Override
    public void reset() {
        putloc = getloc = 0;
    }
}

