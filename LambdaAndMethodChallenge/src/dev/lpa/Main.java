package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        UnaryOperator<String> toUpperCase = String::toUpperCase;
        UnaryOperator<String> toLowerCase = String::toLowerCase;

        UnaryOperator<String> toLowerCaseExceptFirstLetter = source -> {

            String[] tmp = splitString(source);
            if (tmp.length == 1) {
                return source;
            }
            return new StringBuilder(
                    tmp[0].charAt(0) + tmp[0].substring(1).transform(toLowerCase) + " " + tmp[1] + " "
                            + tmp[2].charAt(0) + tmp[2].substring(1).transform(toLowerCase)).toString();
        };

        UnaryOperator<String> toPascalCase = source -> {

            String[] tmp = splitString(source);
            if (tmp.length == 1) {
                return source;
            }
            return new StringBuilder(
                    tmp[0].charAt(0) + tmp[0].substring(1).transform(toLowerCase) + tmp[1].charAt(0)
                            + tmp[2].charAt(0) + tmp[2].substring(1).transform(toLowerCase)
            ).toString();
        };

        Predicate<String> hasSameLastName = source -> {

            String[] parts = source.split(" ");
            return parts[0].equalsIgnoreCase(parts[2]);
        };

        String[] arrayListOfNames = {"Anna", "Bob", "Eve", "Otto", "Adam", "Asa", "Lil", "Nany", "Pip", "Ellen"};
//        Arrays.asList(arrayListOfNames).forEach(System.out::println);
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arrayListOfNames));
        System.out.println("-".repeat(30));

        List<UnaryOperator<String>> operations = new ArrayList<>(List.of(
                String::toLowerCase,
                String::toUpperCase,
                s -> s + " " + generateRandomChar('A', 'Z') + ".",
                s -> s + " " + reverseName(arrayListOfNames[new Random().nextInt(arrayListOfNames.length)]),
                String::toLowerCase,
                String::toUpperCase,
                toLowerCaseExceptFirstLetter,
                toPascalCase
        ));

        List<String> listOfNames = new ArrayList<>(List.of(arrayListOfNames));
        applyChanges(listOfNames, operations);
        System.out.println("-".repeat(30));

        System.out.println("toUpperCase");
        Arrays.setAll(arrayListOfNames, i -> arrayListOfNames[i].transform(toUpperCase));

        listOfNames = new ArrayList<>(List.of(arrayListOfNames));
//        listOfNames.forEach(System.out::println);
        System.out.println(listOfNames);
        System.out.println("-".repeat(30));

//        listOfNames.replaceAll(s -> applyChanges(s, toUpperCase));
//        listOfNames.forEach(System.out::println);

        System.out.println("Adding middle initial");
        listOfNames.replaceAll(s -> s + " " + generateRandomChar('A', 'Z') + ".");
//        listOfNames.forEach(System.out::println);
        System.out.println(listOfNames);
        System.out.println("-".repeat(30));

        System.out.println("Adding last name");
        listOfNames.replaceAll(s -> s + " " + reverseName(arrayListOfNames[new Random().nextInt(arrayListOfNames.length)]));
//        listOfNames.forEach(System.out::println);
        System.out.println(listOfNames);
        System.out.println("-".repeat(30));

        System.out.println("Removing duplicates: ");
        listOfNames.removeIf(hasSameLastName);
//        listOfNames.forEach(System.out::println);
        System.out.println(listOfNames);
        System.out.println("-".repeat(30));

        System.out.println("Transform toLowerCaseExceptFirstLetter");
        listOfNames.replaceAll(s -> s.transform(toLowerCaseExceptFirstLetter));
//        listOfNames.forEach(System.out::println);
        System.out.println(listOfNames);
        System.out.println("-".repeat(30));

        System.out.println("Transform toPascalCase");
        listOfNames.replaceAll(s -> s.transform(toPascalCase));
//        listOfNames.forEach(System.out::println);
        System.out.println(listOfNames);

        System.out.println("-".repeat(30));
    }

    public static void applyChanges(List<String> list, List<UnaryOperator<String>> functions) {

        for (var function : functions) {
            list.replaceAll(s -> s.transform(function));
            System.out.println(list);
        }
    }

    public static char generateRandomChar(char start, char end) {
        return (char) new Random().nextInt(start, end + 1);
    }

    public static String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    public static String[] splitString(String string) {
        return string.split(" ");
    }
}
