package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Eve", "Otto", "Adam", "Asa", "Lil", "Nany", "Pip", "Ellen"};
        String[] fullNames = getFullNames(5, names, () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(fullNames));

        Predicate<String> hasSameFirstAndLastName = source -> {

            String[] parts = source.split(" ");
            return parts[0].equalsIgnoreCase(parts[2]);
        };

        List<String> persons = new ArrayList<>(fullNames.length);

        List<String> persons2 = new ArrayList<>(List.of(fullNames));
        persons2.removeIf(name -> name.split(" ")[0].equals(name.split(" ")[2]));

        for (String n : fullNames) {
            boolean isTrue = hasSameFirstAndLastName.test(n);
            if (!isTrue) {
                persons.add(n);
            } else {
                System.out.println("Removing: " + n);
            }
        }

        System.out.println(persons);
        System.out.println(persons2);
    }

    public static String[] getFullNames(int count, String[] names, Supplier<Integer> s) {

        UnaryOperator<String> reverseName = source -> {

            StringBuilder newString = new StringBuilder();
            int length = source.length();
            for (int i = 0; i < length; i++) {
                newString.append(source.charAt(length - i - 1));
            }
            System.out.println("Reversing: " + source + " -> " + newString.toString().toUpperCase());
            return newString.toString().toUpperCase();
        };

        String[] newArrayOfNames = new String[count];
        for (int i = 0; i < count; i++) {
            String reversedLastName = reverseName(names[s.get()], reverseName);
            newArrayOfNames[i] = names[s.get()].toUpperCase() + " " + names[s.get()].charAt(0) + ". " + reversedLastName;
        }
        return newArrayOfNames;
    }

    public static String reverseName(String string, UnaryOperator<String> u) {

        return u.apply(string);
    }
}
