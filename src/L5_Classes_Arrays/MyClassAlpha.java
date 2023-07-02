package L5_Classes_Arrays;

public class MyClassAlpha {

    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a) {
        if (a<=10)
        alpha = a;
        else {
            System.out.println("sorry max value for alpha is 10 so ");
            alpha = 10;
        }
    }
    int getAlpha(){
        return alpha;
    }
}
