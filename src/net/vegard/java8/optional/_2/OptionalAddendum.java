package net.vegard.java8.optional._2;

import java.util.Optional;

public class OptionalAddendum {

    public static Optional<String> getFullName(final String username) {
        if ("th".equals(username)) {
            return Optional.of("Tony Hawk");
        } else {
            return Optional.empty();
        }
    }

    public static void main(final String[] args) {
        final Optional<String> fullName = getFullName("th");

        if (fullName.isPresent()) {
            System.out.println(fullName.get());
        } else {
            System.out.println("No user found.");
        }

        System.out.println(getFullName(null).orElse("No user found"));
        System.out.println(getFullName("ht").orElse("No user found"));
    }

}
