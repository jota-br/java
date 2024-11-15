package VarArgs.dev.lpa;

public class Main {
    
    public static void main(String... args) {
        
        System.out.println("Hello World");

        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(30));
        printText("Hello");

        System.out.println("-".repeat(30));
        printText("Hello", "World", "Yet", "Again");

        System.out.println("-".repeat(30));
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {

        for (String e : textList) {
            System.out.println(e);
        }
    }
}
