package net.vegard.java8.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Java7DateTimeAPIExample {

    public static void main(final String[] args) {

        try {
            // Find the current year.
            final int currentYear = Calendar.getInstance().get(Calendar.YEAR);

            // Make a date and check if it's before today or not.
            final Date aDate = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").parse(currentYear + "-01-01 00:00:00");
            isBeforeOrAfterToday(aDate);

            // Add a year to the date and check if it's before today or not.
            final Calendar anotherDate = Calendar.getInstance();
            anotherDate.setTime(aDate);
            anotherDate.add(Calendar.YEAR, 1);
            isBeforeOrAfterToday(anotherDate.getTime());
        } catch (final ParseException e) {
            e.printStackTrace();
        }

    }

    private static void isBeforeOrAfterToday(final Date aDate) {
        if (aDate.before(new Date())) {
            System.out.println("The date is before today.");
        } else {
            System.out.println("The date is after today.");
        }
    }

}
