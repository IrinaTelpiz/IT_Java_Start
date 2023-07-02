package Homeworks.L5HW_Java_Arrays_Telpiz_Irina;


import java.util.Arrays;

public class FindAverageDouble {
    public static void main(String[] args) {

        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.random()*5;
        }

        System.out.println("10 random decimal numbers from 0 to 5:\n" + Arrays.toString(arr));

        double sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Average double is:\n" + sum/ arr.length);

    }
}
