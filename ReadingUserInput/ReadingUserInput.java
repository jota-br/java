import java.util.Scanner;

public class ReadingUserInput {
    public static void main (String[] args) {
        System.out.println("Sum total = " + sumUserInput(5));
    }

    public static double sumUserInput (int limit) {
        int counter = 1;
        double sum = 0d;
        
        do { 
            System.out.println("Enter number #" + counter + ":");
            try {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                // int number = Integer.parseInt(input);
                double number = Double.parseDouble(input);
                sum += number;
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Only numbers allowed");
            }
        } while (counter <= limit);

        return sum;
    }
}