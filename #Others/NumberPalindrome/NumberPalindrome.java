public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int n = number;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }
        return (reverse == number);
    }
}