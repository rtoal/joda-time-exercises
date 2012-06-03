Joda-Time Exercises
===================

A collection of exercises useful while learning Joda-Time.

This small little Java app is packaged here as a bunch of unit 
tests and method stubs.  Clone the repo, fill in the method bodies, and keep 
running `mvn test` until you're done.

Obviously it is best if you really try to implement these methods yourself.  If you
get stuck and need to see some possible solutions, just scroll down.

.

.

.

.

.

.

.

.

.

.

.

.

.

.

.
.

.

.

.

.

.

.

.

.
.

.

.

.

.

.

.

.

.

Keep scrolling

.

.

.

.

.

.

.

.

.

.

.

.

.

.

.
.

.

.

.

.

.

.

.

.
.

.

.

.

.

.

.

.

.

Are you sure you need to see the answers?  Don't you want to go back
and keep working?

.

.

.

.

.

.

.

.

.

.

.

.

.

.

.
.

.

.

.

.

.

.

.

.

.

.

.

.

.

.
.

.

.

.

.

.

.

.

.

.

.

.

.

.

.

Okay fine!

    public static String epochTimeOneTrillionInNewYork() {
        return new DateTime(1000000000000L)
                .withZone(DateTimeZone.forID("America/New_York"))
                .toString();
    }
    
    public static String frenchDayNameOfBastilleDay(int year) {
        return new LocalDate(year, 7, 14).dayOfWeek().getAsText(Locale.FRENCH);
    }

    public static DateTime oneBillionSecondsAfter(DateTime dateTime) {
        return dateTime.plusSeconds(1000000000);
    }
    
    public static String usDateTimeStringToBuddhistDateTimeString(String s) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MMMM d, yyyy, h:mm:ss a");
        return DateTime.parse(s, formatter)
                .withZone(DateTimeZone.forID("America/Los_Angeles"))
                .withChronology(BuddhistChronology.getInstance())
                .toString();
    }
    
    public static int fourthThursdayOfNovember(int year) {
        LocalDate date = new LocalDate(year, 11, 1, GJChronology.getInstance());
        while (date.getDayOfWeek() != DateTimeConstants.THURSDAY) {
            date = date.plusDays(1);
        }
        return date.plusWeeks(3).getDayOfMonth();
    }
    
    public static LocalDateTime sixWeeksLaterAtNoon(LocalDate date) {
        return date.plusWeeks(6).toLocalDateTime(new LocalTime(12, 0, 0));
    }
    
    public static long hoursInTwoDaysFrom(DateTime dateTime) {
        return new Interval(dateTime, dateTime.plusDays(2)).toDuration().getStandardHours();
    }
    