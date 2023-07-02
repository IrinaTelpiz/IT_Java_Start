package L9_Interfaces;

public class FixedQue implements ICharQ {

    private char[] q;
    private int putLoc,getLoc;

    FixedQue(int size){
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }

    @Override
    public void put(char ch) {
        if (putLoc == q.length-1){
            System.out.println("Que is full.");
            return;
        }
        putLoc++;
        q[putLoc] = ch;
    }

    @Override
    public char get() {
        if (getLoc == putLoc){
            System.out.println("Que is empty.");
            return 0;
        }
        getLoc++;
        return q[getLoc];
    }
}
