package net.vegard.java8.streams;

import java.util.Arrays;
import java.util.List;

public class CollectionOperationsWithStreams {

    public static void getMeanOfAllDoublesGreaterThanZero(final List<Double> doubles) {
        doubles.stream().filter(d -> d > 0).mapToDouble(Double::new).average().ifPresent(System.out::println);
    }

    public static void main(final String[] args) {
        getMeanOfAllDoublesGreaterThanZero(Arrays.asList(1.2d, 6.22d, 4.2d, -8.4d, 13.37d));
    }

}
