package L9_Interfaces;

public class DynamicQue implements ICharQ_On_Lesson {

    private char[] q;
    private int putLoc,getLoc;

    DynamicQue(int size){
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }
    @Override
    public void put(char ch) {
        if (putLoc==q.length-1){
            char[] t = new char[q.length*2];
            for (int i =0; i< q.length;i++)
                t[i] = q[i];
            q=t;
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
