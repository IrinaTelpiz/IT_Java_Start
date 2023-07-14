package L9_Interfaces;

public class ByTwos implements Series{

    int start,val;

    ByTwos(){
        start = val = 0;
    }

    @Override
    public int getNext() {
        val +=2;
        return val;
    }

    @Override
    public void reset() {
        start = val = 0;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;

    }
}
