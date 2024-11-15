package Autoboxing.dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String... args) {

        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since JKD 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDobleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(int... varargs) {

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i) {

        return i;
    }

    private static Integer returnAnInt(int i) {

        return i;
    }

    private static Double getDobleObject() {

        Double boxed = 100.00;
        return boxed;
    }

    private static double getLiteralDoublePrimitive() {

        return 100.0;
    }
}
