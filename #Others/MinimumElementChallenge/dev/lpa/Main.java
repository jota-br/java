package MinimumElementChallenge.dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] intArray = readIntegers();
        int minValue = findMin(intArray);
        System.out.println("Minimum value is = " + minValue);
    }

    private static int[] readIntegers() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a list of integers, separeted by commas:");
        String input = s.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] intArray) {
        Arrays.sort(intArray);

        return intArray[0];
    }
}
