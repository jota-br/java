public class ChallengeOne {
    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double thirdDouble = (firstDouble + secondDouble) * 100.00d;
        double remainderValue = thirdDouble % 40.00d;

        boolean isZero = (remainderValue == 0.00d);

        System.out.println("The Remainder is zero: " + isZero);

        if (!isZero) {
            System.out.println("The remainder is: " + remainderValue);
        }
    }
}