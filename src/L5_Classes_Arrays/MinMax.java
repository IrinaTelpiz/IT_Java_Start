package L5_Classes;

public class MinMax {
    public static void main(String[] args) {
        int[] nums = {99, -9, 13478, 998, -987, 2, 27, 14, 0, -3};

        int min, max;

        min = max = nums[0];

        for (int i = 1; i<10; i++){
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);

    }
}
