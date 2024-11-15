package SortedArray.dev.lpa;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortedArray {
    
    public static void main(String[] args) {
        
        int[] integerArray = getIntegers(5);
        printArray(sortIntegers(integerArray));

    }

    public static int[] getIntegers(int len) {

        Scanner s = new Scanner(System.in);

        int i = 0;
        int[] array = new int[len];
        while (true) {
            if (i >= len) {
                return array;
            }
            try {
                array[i] = s.nextInt();
            } catch (InputMismatchException e) {
                
            }
            i++;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.format("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        boolean flag = true;
        int tmp;
        int[] sortedArray = Arrays.copyOf(array, array.length);
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = tmp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
