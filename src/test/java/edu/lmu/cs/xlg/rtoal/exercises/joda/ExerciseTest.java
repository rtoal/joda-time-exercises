package edu.lmu.cs.xlg.rtoal.exercises.joda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
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
    public void testBastilleDay() {
        assertThat(Exercises.frenchDayNameOfBastilleDay(2020), is("mardi"));
        assertThat(Exercises.frenchDayNameOfBastilleDay(2012), is("samedi"));
        assertThat(Exercises.frenchDayNameOfBastilleDay(1699), is("mardi"));
        assertThat(Exercises.frenchDayNameOfBastilleDay(3000), is("lundi"));
        assertThat(Exercises.frenchDayNameOfBastilleDay(1882), is("vendredi"));
    }

    @Test
    public void testOneBillionSeconds() {
        assertThat(Exercises.oneBillionSecondsAfter(new DateTime(5)), is(new DateTime(1000000000005L)));
    }

    @Test
    public void testUSToBuddhist() {
        assertThat(Exercises.usDateTimeStringToBuddhistDateTimeString("March 23, 2072, 4:33:05 PM"),
                is("2615-03-23T16:33:05.000-07:00"));
        assertThat(Exercises.usDateTimeStringToBuddhistDateTimeString("February 1, 1900, 12:00:01 AM"),
                is("2443-02-01T00:00:01.000-08:00"));
    }

    @Test
    public void testFourthThursdayOfNovember() {
        assertThat(Exercises.fourthThursdayOfNovember(2012), is(22));
        assertThat(Exercises.fourthThursdayOfNovember(1901), is(28));
        assertThat(Exercises.fourthThursdayOfNovember(1407), is(24));
        assertThat(Exercises.fourthThursdayOfNovember(2155), is(27));
    }

    @Test
    public void testSixWeeksLaterAtNoon() {
        assertThat(Exercises.sixWeeksLaterAtNoon(new LocalDate(1993, 2, 1)), is(new LocalDateTime(1993, 3, 15, 12, 0)));
        assertThat(Exercises.sixWeeksLaterAtNoon(new LocalDate(1996, 2, 1)), is(new LocalDateTime(1996, 3, 14, 12, 0)));
    }

    @Test
    public void testHoursInTwoDays() {
        assertThat(Exercises.hoursInTwoDaysFrom(new DateTime(2000, 1, 1, 0, 0)), is(48L));
        assertThat(Exercises.hoursInTwoDaysFrom(new DateTime(2012, 3, 11, 0, 0)), is(47L));
        assertThat(Exercises.hoursInTwoDaysFrom(new DateTime(2012, 11, 3, 0, 0)), is(49L));
    }
}
