package net.vegard.java8.lambda._1;

import java.util.Arrays;
import java.util.List;

public class SpecializedPrintIntegers {

    public static void printIntegers(final List<Integer> integers, final int min, final int max) {
        for (final Integer anInteger : integers) {
            if (anInteger > min && anInteger < max) {
                System.out.println(anInteger);
            }
        }
    }

    public static void main(final String[] args) {
        printIntegers(Arrays.asList(1, 2, 3, 4), 1, 4);
    }

}
