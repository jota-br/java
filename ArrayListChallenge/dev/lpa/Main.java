package ArrayListChallenge.dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        userInput();
    }

    private static void userInput() {

        ArrayList<String> arrayList = new ArrayList<>();

        boolean flag = true;
        while (flag) {

            printCommands();

            switch (Integer.parseInt(scanner.nextLine())) {
                case 0 -> {

                    flag = false;
                }
                case 1 -> {

                    addItems(arrayList);
                    sortArrayList(arrayList);
                    printList(arrayList);
                }
                case 2 -> {

                    removeItems(arrayList);
                    sortArrayList(arrayList);
                    printList(arrayList);
                }
                default -> {

                    System.out.println("-".repeat(30));
                    System.out.println("Invalid command");
                    System.out.println("-".repeat(30));
                }
            }
        }
    }

    private static void sortArrayList(ArrayList<String> arrayList) {

        arrayList.sort(Comparator.naturalOrder());
    }

    private static void printCommands() {

        String text = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";

        System.out.print(text + " ");
    }

    private static void printList(ArrayList<String> arrayList) {

        System.out.println("-".repeat(30));
        System.out.println("List content = " + arrayList);
        System.out.println("-".repeat(30));

    }

    private static void addItems(ArrayList<String> arrayList) {

        System.out.println("-".repeat(30));
        System.out.print("Add Item(s) {separate items by comma} = ");
        String[] arr = scanner.nextLine().split(",");

        for (String e : arr) {
            e = e.trim();
            if (!arrayList.contains(e)) {
                arrayList.add(e);
            }
        }
    }

    private static void removeItems(ArrayList<String> arrayList) {

        System.out.println("-".repeat(30));
        System.out.print("Remove Item(s) {separate items by comma} = ");
        String[] arr = scanner.nextLine().trim().split(",");

        for (String e : arr) {
            e = e.trim();
            if (arrayList.contains(e)) {
                arrayList.remove(e);
            }
        }
    }

}
