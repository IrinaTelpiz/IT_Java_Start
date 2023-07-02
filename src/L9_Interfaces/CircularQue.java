package L9_Interfaces;

public class CircularQue implements ICharQ{

    private char[] q;
    private int putLoc,getLoc;

    CircularQue(int size){
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }


    @Override
    public void put(char ch) {
        if (putLoc+1==getLoc | ((putLoc == q.length -1) & (getLoc == 0))){
            System.out.println("Que is full.");
            return;
        }
        putLoc++;
        if (putLoc==q.length) putLoc = 0;
        q[putLoc] = ch;

    }

    @Override
    public char get() {
        if (getLoc==putLoc) {

            System.out.println("\n Que is empty");
        }
        return 0;
    }
}
