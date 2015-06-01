package net.vegard.java8.methodreference._2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterPrintIntegersMethodReference {
    public static void printIntegers(final List<Integer> integers, final Predicate<Integer> tester) {
        integers.stream().filter(tester::test).forEach(System.out::println);
    }

    public static void main(final String[] args) {
        printIntegers(Arrays.asList(1, 2, 3, 4), i -> i > 1 && i < 4);
    }
}
