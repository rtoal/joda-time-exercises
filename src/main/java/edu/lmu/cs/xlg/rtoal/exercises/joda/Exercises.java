package edu.lmu.cs.xlg.rtoal.exercises.joda;

import org.joda.time.Days;
import org.joda.time.LocalDate;

/**
 * A utility class containing exercises for you to fill in.
 *
 * <p>Fill in all the method stubs according to the "instructions" in the javadoc comments.
 * For more help on what the methods are supposed to do, see the unit test file.  (You already
 * knew that.)</p>
 */
public class Exercises {

    /**
     * Returns the number of days from the given datetime until the (next) New Years Day.
     */
    public static Days daysUntilNewYear(LocalDate date) {
        LocalDate newYear = date.plusYears(1).withDayOfYear(1);
        return Days.daysBetween(date, newYear);
    }

    /**
     * A method to print a message in case someone thinks this is an application class.
     */
    public static void main(String[] args) {
        System.out.println("Nothing to run here.  Get your unit tests to pass.");
    }
}
