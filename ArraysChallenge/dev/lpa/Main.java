package ArraysChallenge.dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        
        int[] s1 = getRandomArray(10);
        System.out.println(Arrays.toString(s1));
        Arrays.sort(s1);
        System.out.println(Arrays.toString(s1));
        s1 = sortDesc(s1);
        System.out.println(Arrays.toString(s1));
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();

        int[] randomArray = new int[len];

        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(1000);
        }

        return randomArray;
    }

    private static int[] sortDesc(int[] arr) {

        int[] descendingArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            descendingArray[i] = arr[arr.length - 1 - i];
        }

        return descendingArray;
    }
}
