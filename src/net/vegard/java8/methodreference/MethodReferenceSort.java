package net.vegard.java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceSort {
    public static List<Integer> sort(final List<Integer> integers) {
        return null;
    }

    public static void main(final String[] args) {
        List<Integer> ints = Arrays.asList(2, 1, 4, 3);
        ints.forEach(System.out::println);
    }
}
