package net.vegard.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Java8DateTimeAPIExample {

    public static void main(final String[] args) {
        final LocalDateTime aDate = LocalDateTime.of(LocalDate.now().getYear(), 1, 1, 0, 0, 0);
        isBeforeOrAfterToday(aDate);

        final LocalDateTime anotherDate = aDate.plusYears(1);
        isBeforeOrAfterToday(anotherDate);
    }

    private static void isBeforeOrAfterToday(final LocalDateTime aDate) {
        if (aDate.isBefore(LocalDateTime.now())) {
            System.out.println("The date is before today.");
        } else {
            System.out.println("The date is after today.");
        }
    }

}
