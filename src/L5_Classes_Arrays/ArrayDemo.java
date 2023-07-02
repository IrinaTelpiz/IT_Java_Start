package L5_Classes_Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] sample = new int[10];

        int i;

        for (i = 0; i < 10; i++)
            sample[i] = 100 - i;

        for (i = 0; i < 10; i++)
            System.out.println("Array element[" + i + "]: " + sample[i]);
    }
}
