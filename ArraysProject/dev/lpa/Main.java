package ArraysProject.dev.lpa;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);
        
        System.out.format("%n");
        System.out.println("-".repeat(30));

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        System.out.format("%n");
        System.out.println("-".repeat(30));

        int[] newArray;
        newArray = new int[] { 5, 4, 3, 2, 1 };
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.format("%n");
        System.out.println("-".repeat(30));

        int[] newArray2 = new int[5];
        for (int i = 0; i < newArray2.length; i++) {
            newArray2[i] = newArray2.length - i;
        }
        for (int i = 0; i < newArray2.length; i++) {
            System.out.print(newArray2[i] + " ");
        }

        System.out.format("%n");
        System.out.println("-".repeat(30));

        for (int element : newArray2) {
            System.out.print(element + " ");
        }

        System.out.format("%n");
        System.out.println("-".repeat(30));

        System.out.print(Arrays.toString(newArray2));

        System.out.format("%n");
        System.out.println("-".repeat(30));

        Object objectVariable = newArray2;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        System.out.format("%n");
        System.out.println("-".repeat(30));

        // This is not good practice
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray2;

        System.out.print(Arrays.toString(objectArray));

        System.out.format("%n");
        System.out.println("-".repeat(30));
    }
}
