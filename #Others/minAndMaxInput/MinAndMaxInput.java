import java.util.Scanner;

public class MinAndMaxInput {
    public static void main (String[] args) {
        minAndMax();
    }

    public static void minAndMax () {
        double min = 0, max = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do { 
            try {
                System.out.println("Insert number, or any character to exit: ");
                String input = scanner.nextLine();
                double number = Double.parseDouble(input);

                if (number < min || count == 0) {
                    min = number;
                }
                if (number > max || count == 0) {
                    max = number;
                }
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        } while (true);
        if (count == 0) {
            System.out.println("No valid data entered");
        } else {
            System.out.println("Minimum value: " + min + "\nMaximum value: " + max);
        }
    }
}