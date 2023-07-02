package L11_Collections;

import java.util.Random;
import java.util.Scanner;

public class BubbleSorting {

    public static int[] bubbleSort (int[] array){

        boolean swapped;
        for (int i = 0; i< array.length - 1; i++){
            swapped = false;
            for (int j = 0;j < array.length - i - 1; j++){

                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) break;

        }
        return array;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int arrayLength = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();
        System.out.println("Enter range");
        int min = input.nextInt();
        int max = input.nextInt();
        if (max <= min) {
            System.out.println("Max must be  greater than min, enter max again:");
            max = input.nextInt();
        } else {
            arrayLength = size;
        }
        int array[] = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println("\nInitial array:");
        for (int i: array){
            System.out.println(i+ " ");
        }
        bubbleSort(array);
        System.out.println("\n\nSorted:");
        for (int i: array){
            System.out.println(i+ " ");
        }
    }

}
