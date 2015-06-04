package net.vegard.java8.streams;

import java.util.Arrays;
import java.util.List;

public class CollectionOperationsWithoutStreams {

    public static void getMeanOfAllDoublesGreaterThanZero(final List<Double> doubles) {

        int numberOfDoubles = 0;
        double doublesSum = 0;
        for (final Double aDouble : doubles) {
            if (aDouble > 0) {
                numberOfDoubles++;
                doublesSum += aDouble;
            }
        }

        System.out.println(doublesSum / numberOfDoubles);
    }

    public static void main(final String[] args) {
        getMeanOfAllDoublesGreaterThanZero(Arrays.asList(1.2d, 6.22d, 4.2d, -8.4d, 13.37d));
    }

}
