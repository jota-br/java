public class Hello {

    public static void main(String[] args) {
        System.out.println("Print in New Line!");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien");
        }

        int topScore = 90;
        if (topScore >= 100) {
            System.out.println("High Score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("High Score");
        }

        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("High Score");
        }

        // int newValue = 50;
        // if (newValue = 10) { // assigning newValue to 10
        //     System.out.println("This is an error");
        // }
    }
}
