package LinkedListChallenge2.dev.lpa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<Town> list = new LinkedList<>();
        populate(list);
        commands(list);
    }

    public static void populate(LinkedList<Town> list) {

        Town town = new Town("Sidney", 0);
        list.add(town);

        town = new Town("Melbourne", 877);
        list.add(town);

        town = new Town("Brisbane", 917);
        list.add(town);

        town = new Town("Adelaide", 1374);
        list.add(town);

        town = new Town("Alice Springs", 2771);
        list.add(town);

        town = new Town("Perth", 3923);
        list.add(town);

        town = new Town("Darwin", 3972);
        list.add(town);
    }

    public static void printList(LinkedList<Town> list) {

        Town previousTown = list.getFirst();
        ListIterator<Town> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println(previousTown.getName() + " --> " + town.getName());
            previousTown = town;
        }
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
        String input = "M";
        while (true) {
            switch (input.toUpperCase()) {
                case "F", "FORWARD" -> {
                    traverseList(list, "next");
                }
                case "B", "BACKWARD" -> {
                    traverseList(list, "previous");
                }
                case "L", "LIST" -> {
                    printList(list);
                }
                case "M", "MENU" -> {
                    System.out.println(menu);
                }
                case "Q", "QUIT" -> {
                    break;
                }
                default -> System.out.println(menu);
            }
            input = scanner.nextLine();
        }
    }

    public static void traverseList(LinkedList<Town> list, String move) {

        Town previousTown = (move.equals("next") ? list.getFirst() : list.getLast());

        int startIndex = (move.equals("next") ? 1 : list.size() - 1);

        ListIterator<Town> iterator = list.listIterator(startIndex);

        if (move.equals("next")) {

            while (iterator.hasNext()) {
                
                var town = iterator.next();
                System.out.println(previousTown.getName() + " --> " + town.getName());
                previousTown = town;
            }
        } else if (move.equals("previous")) {

            while (iterator.hasPrevious()) {

                var town = iterator.previous();
                System.out.println(previousTown.getName() + " --> " + town.getName());
                previousTown = town;
            }
        }
    }
}

class Town {

    private String name;
    private int distanceToSydney;

    public Town(String name, int distanceToSydney) {
        this.name = name;
        this.distanceToSydney = distanceToSydney;
    }

    public String getName() {
        return name;
    }

    public int getDistanceToSydney() {
        return distanceToSydney;
    }
}
