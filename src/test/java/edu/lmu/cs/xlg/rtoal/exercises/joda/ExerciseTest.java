package edu.lmu.cs.xlg.rtoal.exercises.joda;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.joda.time.Days;
import org.joda.time.LocalDate;

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
}
