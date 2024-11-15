package MinimumElementChallenge2.dev.lpa;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class MinimumElement {

    public static void main(String[] args) {
        
        int len = readInteger();
        int intArray[] = readElements(len);
        System.out.println(Arrays.toString(intArray));
        System.out.println(findMin(intArray));
    }

    private static int readInteger() {

        Scanner s = new Scanner(System.in);
        int value;
        
        while (true) {

            try {
                value = s.nextInt();
                break;
            } catch (InputMismatchException e){

            }
        }

        return value;
    }

    private static int[] readElements(int len) {

        Scanner scanner = new Scanner(System.in);
        int[] value = new int[len];
        int i = 0;

        while (true) {

            if (i >= len) {
                break;
            }

            try {
                value[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException e) {

            }
        }

        return value;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int e : array) {
            if (e < min) {
                min = e;
            }
        }

        return min;
    }
}
