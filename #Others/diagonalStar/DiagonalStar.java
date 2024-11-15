public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {

                boolean isFirstRowOrColumn = i == 1 || j == 1;
                boolean isLastRowOrColumn = i == number || j == number;
                boolean isDiagonal = (i == j) || (j == (number - i + 1));

                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

   
            }
            System.out.println();
        }
    }
}