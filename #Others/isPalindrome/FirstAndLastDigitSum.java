public class FirstAndLastDigitSum {
    public static void main (String[] args) {
        System.out.println(sumFirstAndLastDigit(11));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int n = number;
        int firstDigit = -1;
        int lastDigit = -1;
        while (true) {
            if (firstDigit == -1) {
                firstDigit = n % 10;
            }

            if (n / 10 == 0) {
                lastDigit = n % 10;
                break;
            }
            n /= 10;
        }

        return firstDigit + lastDigit;
    }
}