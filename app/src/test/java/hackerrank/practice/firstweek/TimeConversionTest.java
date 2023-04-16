package hackerrank.practice.firstweek;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TimeConversionTest {
    @Test
    void should_Add12HoursAndClearAMPM_When_StringContainsPMAndIsDifferentThan12PM() {
        String s = "07:05:45PM";
        String convertedDate = TimeConversion.timeConversion(s);
        assertEquals("19:05:45", convertedDate);
    }

    @Test
    void should_ClearAM_When_StringContainsAm() {
        String s = "07:05:45AM";
        String convertedDate = TimeConversion.timeConversion(s);
        assertEquals("07:05:45", convertedDate);
    }
}
