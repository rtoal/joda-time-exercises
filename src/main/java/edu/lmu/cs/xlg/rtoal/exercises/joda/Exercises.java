package edu.lmu.cs.xlg.rtoal.exercises.joda;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;

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
     * Returns the ISO8601 of the datetime string, in New York, at epoch time 1000000000000.
     */
    public static String epochTimeOneTrillionInNewYork() {
        return null;
    }

    /**
     * Returns the datetime one billion seconds after a given datetime.
     */
    public static DateTime oneBillionSecondsAfter(DateTime dateTime) {
        return null;
    }

    /**
     * Return the name of the day of the week, in French, of Bastille Day (July 14) in the year
     * 2020.
     */
    public static String frenchDayNameOfBastilleDay2020() {
        return null;
    }

    // TODO - SEVEN MORE STUBS AT LEAST
}
