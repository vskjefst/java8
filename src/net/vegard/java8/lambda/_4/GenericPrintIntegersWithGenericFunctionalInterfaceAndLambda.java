package net.vegard.java8.lambda._4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GenericPrintIntegersWithGenericFunctionalInterfaceAndLambda {
    public static void printIntegers(final List<Integer> integers, final Predicate<Integer> tester) {
        for (final Integer integer : integers) {
            if (tester.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public static void main(final String[] args) {
        printIntegers(Arrays.asList(1, 2, 3, 4), i -> i > 1 && i < 4);
    }
}
