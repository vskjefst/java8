package net.vegard.java8.methodreference._1;

import java.util.Arrays;
import java.util.List;

public class PrintIntegersMethodReference {
    public static void printIntegers(final List<Integer> integers) {
        integers.forEach(System.out::println);
    }

    public static void main(final String[] args) {
        printIntegers(Arrays.asList(1, 2, 3, 4));
    }
}
