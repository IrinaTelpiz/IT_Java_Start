package L3;

public class BreakDemoNested {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("counter of the outer loop: " + i);
            System.out.print("\tcounter of the inner loop: ");
            int t = 0;
            while (t < 100) {
                if (t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("both loops have stopped");
    }
}
