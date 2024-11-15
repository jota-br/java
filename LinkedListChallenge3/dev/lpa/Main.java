package LinkedListChallenge3.dev.lpa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Town(String name, int distanceToSydney) {

    @Override
    public String toString() {
        return this.name + " (" + this.distanceToSydney + ")";
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList<Town> list = new LinkedList<>();
        
        populate(list, new Town("Darwin", 3972));
        populate(list, new Town("Sidney", 0));
        populate(list, new Town("Melbourne", 877));
        populate(list, new Town("Brisbane", 917));
        populate(list, new Town("Alice Springs", 2771));
        populate(list, new Town("Perth", 3923));
        populate(list, new Town("Adelaide", 1374));


        System.out.println(list.toString());

        var iterator = list.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }

            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }

            String input = scanner.nextLine();
            switch (input.toUpperCase()) {
                case "F", "FORWARD" -> {
                    System.out.println("Go forward");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B", "BACKWARD" -> {
                    System.out.println("Go backwards");
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "L", "LIST" -> {
                    printList(list);
                }
                case "M", "MENU" -> {
                    printMenu();
                }
                case "Q", "QUIT" -> {
                    quitLoop = true;
                }
                default -> printMenu();
            }
        }
    }

    public static void populate(LinkedList<Town> list, Town town) {

        if (list.contains(town)) {
            System.out.println("Duplicated town -->" + town.name());
            return;
        }

        for (Town t : list) {
            if (t.name().equalsIgnoreCase(town.name())) {
                System.out.println("Duplicated town -->" + town.name());
                return;
            }
        }

        int index = 0;
        int min = Integer.MAX_VALUE;
        for (var listTown : list) {
            if (town.distanceToSydney() < listTown.distanceToSydney() && min > listTown.distanceToSydney()) {
                index = list.indexOf(listTown);
                min = town.distanceToSydney();
            }
        }

        list.add(index, town);
    }

    public static void printList(LinkedList<Town> list) {

        Town previousTown = list.getFirst();
        ListIterator<Town> iterator = list.listIterator(0);

        while (iterator.hasNext()) {
            var town = iterator.next();
            String indicator = (town.equals(list.getLast())) ? "" : " --> ";
            System.out.print(town.name() + indicator);
        }
        System.out.println();
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word of ltter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

    public static void commands(LinkedList<Town> list) {

        Scanner scanner = new Scanner(System.in);

        String menu = """
                Available actions (select word of ltter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";

        boolean flag = true;
        System.out.println(menu);
        while (flag) {
            String input = scanner.nextLine();
            switch (input.toUpperCase().substring(0,1)) {
                case "F" -> {
                    traverseList(list, "next");
                }
                case "B" -> {
                    traverseList(list, "previous");
                }
                case "L" -> {
                    printList(list);
                }
                case "M" -> {
                    System.out.println(menu);
                }
                case "Q" -> {
                    flag = false;
                }
                default -> System.out.println(menu);
            }
        }
    }

    public static void traverseList(LinkedList<Town> list, String move) {

        Town previousTown = (move.equals("next") ? list.getFirst() : list.getLast());

        int startIndex = (move.equals("next") ? 1 : list.size() - 1);

        ListIterator<Town> iterator = list.listIterator(startIndex);

        if (move.equals("next")) {

            while (iterator.hasNext()) {

                var town = iterator.next();
                System.out.println(previousTown.name() + " --> " + town.name());
                previousTown = town;
            }
        } else if (move.equals("previous")) {

            while (iterator.hasPrevious()) {

                var town = iterator.previous();
                System.out.println(previousTown.name() + " --> " + town.name());
                previousTown = town;
            }
        }
    }
}
