package hackerrank.practice.firstweek;

/**
 * Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 *       - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * @author federico.herrera
 */
public class TimeConversion {
    public static String timeConversion(String s) {
        String[] splitted = s.split(":");
        int hour = Integer.parseInt(splitted[0]);
        int min = Integer.parseInt(splitted[1]);
        String amPm = splitted[splitted.length - 1].substring(splitted.length - 1);
        if (amPm.equalsIgnoreCase("AM") && hour == 12) {
            hour = 00;
        } else if (amPm.equalsIgnoreCase("PM") && hour != 12) {
            hour += 12;
        }
        return String.format("%02d:%02d:%s", hour, min, splitted[2].substring(0, 2));
    }
}
