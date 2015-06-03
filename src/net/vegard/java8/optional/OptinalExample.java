package net.vegard.java8.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptinalExample {

    public static void main(final String[] args) {
        final List<Integer> integers = ThirdPartyAPI.getIntegers();

        // Preventing NullPointerException with catch/try-block.
        try {
            System.out.println(integers.size());
        } catch (final NullPointerException e) {
            System.out.println("The integers object was null and a NullPointerException was thrown, but we caught it. Phew!");
        }

        // Preventing NullPointerException with if/else-test.
        if (integers != null) {
            System.out.println(integers.size());
        } else {
            System.out.println("Our test show that the integers object is null, but no NullPointerException was thrown since we did a test before calling any methods on it.");
        }

        // Bypassing NullPointerException challenges completely with optional.
        final Optional<List<Integer>> anOptional = ThirdPartyAPIUsingOptional.getIntegers();
        System.out.println(anOptional.orElse(Collections.emptyList()).size());
    }
}
