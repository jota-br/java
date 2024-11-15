public class PrimeNumber {
    public static void main(String[] args) {
        
        for (long i = 0; i <= 390160L; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number");
        }
    }

    public static boolean isPrime (long wholeNumber) {
        for (long divisor = 2L; divisor <= wholeNumber / 2L; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        
        return true;
    }
}