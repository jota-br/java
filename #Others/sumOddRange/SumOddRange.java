public class SumOddRange {
    public static void main(String[] args) {

        int start = 1;
        int end = 500;

        System.out.println("Odd sum for range " + start + " to " + end + " is " + sumOdd(start, end));
    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if ((start < 1 || end < 1) || (end < start)) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
