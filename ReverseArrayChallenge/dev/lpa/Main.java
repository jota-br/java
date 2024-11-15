package ReverseArrayChallenge.dev.lpa;
import java.util.Arrays;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = randomArray(6);
        System.out.println(Arrays.toString(array));
        array = reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] randomArray(int len) {

        Random random = new Random();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(9999);
        }
        return array;
    }

    public static int[] reverseArray(int[] array) {

        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
