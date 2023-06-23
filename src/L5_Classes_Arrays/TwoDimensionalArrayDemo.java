package L5_Classes_Arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {

        int l, c;

        int[][] table = new int[3][4];

        for (l = 0; l < 3; l++){
            for (c = 0; c < 4; c++){
                table[l][c] = (l*4) + c + 1;
                System.out.print(table[l][c] + "\t");
            }
            System.out.println();
        }

        int[][] tableIrregular = new int [3][];
        tableIrregular[0] = new int[4];
        tableIrregular[1] = new int[5];
        tableIrregular[2] = new int[6];

        int[][] nums = {{99, -9, 13478, 998, -987, 2, 27, 14, 0, -3}, {99,-9,-3}};
    }
}
