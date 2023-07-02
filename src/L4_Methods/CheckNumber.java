package L4_Methods;

public class CheckNumber {

    static boolean isEven (int x) {
        if ((x % 2) == 0) return  true;
        else return false;
    }

    static boolean isFactor(int a, int b) {
        if ((b % a) == 0) return  true;
        else return false;
    }
}
