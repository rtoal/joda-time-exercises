package edu.lmu.cs.xlg.rtoal.exercises.joda;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

/**
 * A utility class containing exercises for you to fill in.
 *
 * <p>Fill in all the method stubs according to the "instructions" in the methods' comments.
 * For more help on what the methods are supposed to do, see the unit test file.  (You already
 * knew that.)</p>
 *
 * <p>We gave you the first one, daysUntilNewYear.  It was taken from the Joda-Time main page
 * on SourceForge.</p>
 */
public class Exercises {

    /**
     * Returns the number of days from the given local date until the (next) New Years Day.
     */
    public static Days daysUntilNewYear(LocalDate date) {
        LocalDate newYear = date.plusYears(1).withDayOfYear(1);
        return Days.daysBetween(date, newYear);
    }

    /**
     * Returns the ISO8601 datetime string, in New York, of epoch time 1000000000000.
     */
    public static String epochTimeOneTrillionInNewYork() {
        // TODO: Stub
        return null;
    }

    /**
     * Returns the datetime one billion seconds after a given datetime.
     */
    public static DateTime oneBillionSecondsAfter(DateTime dateTime) {
        // TODO: Stub
        return null;
    }

    /**
     * Return the name of the day of the week, in French, of Bastille Day (July 14) in the given
     * year, using the default chronology.
     */
    public static String frenchDayNameOfBastilleDay(int year) {
        // TODO: Stub
        return null;
    }

    /**
     * Returns the ISO string representation for the datetime, in the Buddhist Chronology, for
     * the instant obtained by parsing an input string in the U.S. style such as
     * "March 3, 2072, 4:33:05 PM" assuming Pacific Time (America/Los_Angeles).
     */
    public static String usDateTimeStringToBuddhistDateTimeString(String s) {
        // TODO: Stub
        return null;
    }

    /**
     * Return the day of month of the fourth Thursday of November of the given year,
     * using the GJ Chronology.
     */
    public static int fourthThursdayOfNovember(int year) {
        // TODO: Stub
        return 0;
    }

    /**
     * Return the LocalDateTime, at noon, of the day that is exactly six weeks from the given
     * date.
     */
    public static LocalDateTime sixWeeksLaterAtNoon(LocalDate date) {
        // TODO: Stub
        return null;
    }

    /**
     * Returns the number of hours in the two day period starting from the given DateTime.
     */
    public static long hoursInTwoDaysFrom(DateTime dateTime) {
        // TODO: Stub
        return 0;
    }
}
