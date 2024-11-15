public class digitSum {
    public static void main(String[] args) {
        int sum = sumDigits(4);
        System.out.println(sum);
    }

    public static int sumDigits (int number) {
        if (number < 1) {
            return -1;
        }

        int i = number;
        int sum = 0;
        while (i > 0) {
            sum  += (i % 10);
            i = i / 10;
        }
        return sum;
    }
}