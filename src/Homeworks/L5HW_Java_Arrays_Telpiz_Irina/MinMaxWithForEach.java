package Homeworks.L5HW_Java_Arrays_Telpiz_Irina;

import java.util.Arrays;

public class MinMaxWithForEach {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;

        System.out.print("List of numbers:");
        for (int i = 0; i < nums.length; i++) System.out.print(" " + nums[i]);
        System.out.println();

        min = max = nums[0];
        for (int i : nums){
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("MIN & MAX: " + min + " " + max);

    }
}
