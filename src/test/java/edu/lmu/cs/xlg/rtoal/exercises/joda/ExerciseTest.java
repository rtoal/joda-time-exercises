package edu.lmu.cs.xlg.rtoal.exercises.joda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.junit.Test;

/**
 * The unit tests for the Joda-Time exercises.
 */
public class ExerciseTest {

    @Test
    public void testDaysUntilNewYear() {
        assertThat(Exercises.daysUntilNewYear(new LocalDate(2003, 12, 30)), is(Days.TWO));
        assertThat(Exercises.daysUntilNewYear(new LocalDate(2003, 12, 31)), is(Days.ONE));
        assertThat(Exercises.daysUntilNewYear(new LocalDate(2003, 1, 1)), is(Days.days(365)));
        assertThat(Exercises.daysUntilNewYear(new LocalDate(2004, 1, 1)), is(Days.days(366)));
    }

    @Test
    public void testNewYorkTrillion() {
        assertThat(Exercises.epochTimeOneTrillionInNewYork(), is("2001-09-08T21:46:40.000-04:00"));
    }

    @Test
    public void testBastilleDay2020() {
        assertThat(Exercises.frenchDayNameOfBastilleDay2020(), is("mardi"));
    }

    @Test
    public void testOneBillionSeconds() {
        assertThat(Exercises.oneBillionSecondsAfter(new DateTime(5)), is(new DateTime(1000000000005L)));
    }
}
