package L10_Exception_Handling;

public class NonIntResultException extends Exception{

    int n;
    int d;

    NonIntResultException(int n, int d){
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Result of operation " + n +
                " / " + d + " is not an integer.";
    }
}
