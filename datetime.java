import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class datetime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input the date and time values
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();// 1 is January
        System.out.print("Day: ");
        int day = sc.nextInt();
        System.out.print("Hour: ");
        int hour = sc.nextInt();
        System.out.print("Minute: ");
        int minute = sc.nextInt();
        System.out.print("Second: ");
        int second = sc.nextInt();
        System.out.print("Millisecond: ");
        int millisecond = sc.nextInt();
        System.out.print("Microsecond: ");
        int microsecond = sc.nextInt();
        System.out.print("Nanosecond: ");
        int nanosecond = sc.nextInt();
        LocalDateTime enteredDateAndTime = LocalDateTime.of(year, month, day, hour, minute, second)
                .withNano(millisecond * 1000000 + microsecond * 1000 + nanosecond); // Convert datetime of
                                                                                    // GregorianCalendar object to
                                                                                    // LocalDateTime object named
                                                                                    // enteredDateAndTime without time
                                                                                    // zone
        DateTimeFormatter era1 = DateTimeFormatter.ofPattern("GGG"); // Format the date and time values with specified
                                                                     // pattern
        DateTimeFormatter era2 = DateTimeFormatter.ofPattern("GGGG");
        DateTimeFormatter era3 = DateTimeFormatter.ofPattern("GGGGG");
        DateTimeFormatter year1 = DateTimeFormatter.ofPattern("uu");
        DateTimeFormatter year2 = DateTimeFormatter.ofPattern("uuuu");
        DateTimeFormatter yearEra = DateTimeFormatter.ofPattern("uu");
        DateTimeFormatter yearEra2 = DateTimeFormatter.ofPattern("uuuu");
        DateTimeFormatter dayOfYear = DateTimeFormatter.ofPattern("D");
        DateTimeFormatter monthOfYear = DateTimeFormatter.ofPattern("M");
        DateTimeFormatter monthOfYear2 = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter monthOfYear3 = DateTimeFormatter.ofPattern("MMMM");
        DateTimeFormatter monthOfYear4 = DateTimeFormatter.ofPattern("MMMMM");
        DateTimeFormatter dayOfMonth = DateTimeFormatter.ofPattern("d");
        DateTimeFormatter quarter = DateTimeFormatter.ofPattern("q");
        DateTimeFormatter quarter2 = DateTimeFormatter.ofPattern("qqq");
        DateTimeFormatter quarter3 = DateTimeFormatter.ofPattern("qqqq");
        DateTimeFormatter weekBasedYear = DateTimeFormatter.ofPattern("YY");
        DateTimeFormatter weekBasedYear2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter weekOfYear = DateTimeFormatter.ofPattern("w");
        DateTimeFormatter weekOfMonth = DateTimeFormatter.ofPattern("W");
        DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("E");
        DateTimeFormatter dayOfWeek2 = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter dayOfWeek3 = DateTimeFormatter.ofPattern("EEEEE");
        DateTimeFormatter localDayOfWeek = DateTimeFormatter.ofPattern("e");
        DateTimeFormatter localDayOfWeek2 = DateTimeFormatter.ofPattern("eee");
        DateTimeFormatter localDayOfWeek3 = DateTimeFormatter.ofPattern("eeee");
        DateTimeFormatter localDayOfWeek4 = DateTimeFormatter.ofPattern("eeeee");
        DateTimeFormatter localWeekOfMonth = DateTimeFormatter.ofPattern("F");
        DateTimeFormatter amPm = DateTimeFormatter.ofPattern("a");
        DateTimeFormatter hour12 = DateTimeFormatter.ofPattern("h");
        DateTimeFormatter hour0_11 = DateTimeFormatter.ofPattern("K");
        DateTimeFormatter hour24 = DateTimeFormatter.ofPattern("k");
        DateTimeFormatter hourOfDay = DateTimeFormatter.ofPattern("H");
        DateTimeFormatter minute1 = DateTimeFormatter.ofPattern("m");
        DateTimeFormatter second1 = DateTimeFormatter.ofPattern("s");
        DateTimeFormatter fractionOfSecond = DateTimeFormatter.ofPattern("SSSSSSSSS");
        DateTimeFormatter millisecondOfDay = DateTimeFormatter.ofPattern("A");
        DateTimeFormatter nanosecondOfSecond = DateTimeFormatter.ofPattern("n");
        DateTimeFormatter nanosecondOfDay = DateTimeFormatter.ofPattern("N");
        DateTimeFormatter timezoneId = DateTimeFormatter.ofPattern("VV");
        DateTimeFormatter timezoneName = DateTimeFormatter.ofPattern("z");
        DateTimeFormatter timezoneName2 = DateTimeFormatter.ofPattern("zzzz");
        DateTimeFormatter timezoneOffset = DateTimeFormatter.ofPattern("OOOO");
        DateTimeFormatter timezoneOffsetZ = DateTimeFormatter.ofPattern("XXXXX");
        DateTimeFormatter timezoneOffsetX = DateTimeFormatter.ofPattern("xxxxx");
        DateTimeFormatter timezoneOffset2 = DateTimeFormatter.ofPattern("ZZZZZ");
        DateTimeFormatter timezoneOffsetZ1 = DateTimeFormatter.ofPattern("ZZZZ");
        ZonedDateTime enteredDateAndTimeTimezone = ZonedDateTime.of(enteredDateAndTime, ZoneId.systemDefault());// Get
                                                                                                                // time
                                                                                                                // zone
                                                                                                                // of
                                                                                                                // entered
                                                                                                                // date
                                                                                                                // and
                                                                                                                // time
                                                                                                                // values
        System.out.println("Era: " + era1.format(enteredDateAndTime) + " (" + era2.format(enteredDateAndTime) + ")"
                + " (" + era3.format(enteredDateAndTime) + ")"); // Print the date and time values with formatted date
                                                                 // and time pattern
        System.out.println("Year: " + year1.format(enteredDateAndTime) + " (" + year2.format(enteredDateAndTime) + ")");
        System.out.println(
                "Era Year: " + yearEra.format(enteredDateAndTime) + " (" + yearEra2.format(enteredDateAndTime) + ")");
        System.out.println("Day of Year: " + dayOfYear.format(enteredDateAndTime));
        System.out.println("Month of Year: " + monthOfYear.format(enteredDateAndTime) + " ("
                + monthOfYear2.format(enteredDateAndTime) + ")" + " (" + monthOfYear3.format(enteredDateAndTime) + ")"
                + " (" + monthOfYear4.format(enteredDateAndTime) + ")");
        System.out.println("Day of Month: " + dayOfMonth.format(enteredDateAndTime));
        System.out.println("Quarter: " + quarter.format(enteredDateAndTime) + " (" + quarter2.format(enteredDateAndTime)
                + ")" + " (" + quarter3.format(enteredDateAndTime) + ")");
        System.out.println("ISO Week-based Year: " + weekBasedYear.format(enteredDateAndTime) + " ("
                + weekBasedYear2.format(enteredDateAndTime) + ")");
        System.out.println("Week of Year: " + weekOfYear.format(enteredDateAndTime));
        System.out.println("Week of Month: " + weekOfMonth.format(enteredDateAndTime));
        System.out.println("Day of Week: " + dayOfWeek.format(enteredDateAndTime) + " ("
                + dayOfWeek2.format(enteredDateAndTime) + ")" + " (" + dayOfWeek3.format(enteredDateAndTime) + ")");
        System.out.println("Local Day of Week: " + localDayOfWeek.format(enteredDateAndTime) + " ("
                + localDayOfWeek2.format(enteredDateAndTime) + ")" + " (" + localDayOfWeek3.format(enteredDateAndTime)
                + ")" + " (" + localDayOfWeek4.format(enteredDateAndTime) + ")");
        System.out.println("Local Week of Month: " + localWeekOfMonth.format(enteredDateAndTime));
        System.out.println("AM/PM: " + amPm.format(enteredDateAndTime));
        System.out.println("12 Hour Format " + hour12.format(enteredDateAndTime));
        System.out.println("0-11 Hour Format: " + hour0_11.format(enteredDateAndTime));
        System.out.println("24 Hour Format: " + hour24.format(enteredDateAndTime));
        System.out.println("Hour of Day: " + hourOfDay.format(enteredDateAndTime));
        System.out.println("Minute: " + minute1.format(enteredDateAndTime));
        System.out.println("Second: " + second1.format(enteredDateAndTime));
        System.out.println("Fraction of Second: " + fractionOfSecond.format(enteredDateAndTime));
        System.out.println("Millisecond of Day: " + millisecondOfDay.format(enteredDateAndTime));
        System.out.println("Nanosecond: " + nanosecondOfSecond.format(enteredDateAndTime));
        System.out.println("Nanosecond of Day: " + nanosecondOfDay.format(enteredDateAndTime));
        System.out.println("Time Zone ID: " + timezoneId.format(enteredDateAndTimeTimezone));
        System.out.println("Time Zone: " + timezoneName2.format(enteredDateAndTimeTimezone) + " ("
                + timezoneName.format(enteredDateAndTimeTimezone) + ")");
        System.out.println("Localized Time Zone Offset: " + timezoneOffset.format(enteredDateAndTimeTimezone) + " ("
                + timezoneOffset2.format(enteredDateAndTimeTimezone) + ")");
        System.out.println("Time Zone Offset: " + timezoneOffsetZ.format(enteredDateAndTimeTimezone) + " ("
                + timezoneOffsetX.format(enteredDateAndTimeTimezone) + ")" + " ("
                + timezoneOffsetZ1.format(enteredDateAndTimeTimezone) + ")");

        ZonedDateTime dateAndTimeNow = ZonedDateTime.now(); // Get the current date and time based on local computer
                                                            // date and time with local time zone
        System.out.println("Current Era: " + era1.format(dateAndTimeNow) + " (" + era2.format(dateAndTimeNow) + ")"
                + " (" + era3.format(dateAndTimeNow) + ")"); // Print the formatted date and time values in current
                                                             // local date and time
        System.out.println("Current Year: " + year1.format(dateAndTimeNow) + " (" + year2.format(dateAndTimeNow) + ")");
        System.out.println(
                "Current Era Year: " + yearEra.format(dateAndTimeNow) + " (" + yearEra2.format(dateAndTimeNow) + ")");
        System.out.println("Current Day of Year: " + dayOfYear.format(dateAndTimeNow));
        System.out.println("Current Month of Year: " + monthOfYear.format(dateAndTimeNow) + " ("
                + monthOfYear2.format(dateAndTimeNow) + ")" + " (" + monthOfYear3.format(dateAndTimeNow) + ")" + " ("
                + monthOfYear4.format(dateAndTimeNow) + ")");
        System.out.println("Current Day of Month: " + dayOfMonth.format(dateAndTimeNow));
        System.out.println("Current Quarter: " + quarter.format(dateAndTimeNow) + " (" + quarter2.format(dateAndTimeNow)
                + ")" + " (" + quarter3.format(dateAndTimeNow) + ")");
        System.out.println("Current ISO Week-based Year: " + weekBasedYear.format(dateAndTimeNow) + " ("
                + weekBasedYear2.format(dateAndTimeNow) + ")");
        System.out.println("Current Week of Year: " + weekOfYear.format(dateAndTimeNow));
        System.out.println("Current Week of Month: " + weekOfMonth.format(dateAndTimeNow));
        System.out.println("Current Day of Week: " + dayOfWeek.format(dateAndTimeNow) + " ("
                + dayOfWeek2.format(dateAndTimeNow) + ")" + " (" + dayOfWeek3.format(dateAndTimeNow) + ")");
        System.out.println("Current Local Day of Week: " + localDayOfWeek.format(dateAndTimeNow) + " ("
                + localDayOfWeek2.format(dateAndTimeNow) + ")" + " (" + localDayOfWeek3.format(dateAndTimeNow) + ")"
                + " (" + localDayOfWeek4.format(dateAndTimeNow) + ")");
        System.out.println("Current Local Week of Month: " + localWeekOfMonth.format(dateAndTimeNow));
        System.out.println("Current AM/PM: " + amPm.format(dateAndTimeNow));
        System.out.println("Current 12 Hour Format " + hour12.format(dateAndTimeNow));
        System.out.println("Current 0-11 Hour Format: " + hour0_11.format(dateAndTimeNow));
        System.out.println("Current 24 Hour Format: " + hour24.format(dateAndTimeNow));
        System.out.println("Current Hour of Day: " + hourOfDay.format(dateAndTimeNow));
        System.out.println("Current Minute: " + minute1.format(dateAndTimeNow));
        System.out.println("Current Second: " + second1.format(dateAndTimeNow));
        System.out.println("Current Fraction of Second: " + fractionOfSecond.format(dateAndTimeNow));
        System.out.println("Current Millisecond of Day: " + millisecondOfDay.format(dateAndTimeNow));
        System.out.println("Current Nanosecond: " + nanosecondOfSecond.format(dateAndTimeNow));
        System.out.println("Current Nanosecond of Day: " + nanosecondOfDay.format(dateAndTimeNow));
        System.out.println("Current Time Zone ID: " + timezoneId.format(dateAndTimeNow));
        System.out.println("Current Time Zone: " + timezoneName2.format(dateAndTimeNow) + " ("
                + timezoneName.format(dateAndTimeNow) + ")");
        System.out.println("Current Localized Time Zone Offset: " + timezoneOffset.format(dateAndTimeNow) + " ("
                + timezoneOffset2.format(dateAndTimeNow) + ")");
        System.out.println("Current Time Zone Offset: " + timezoneOffsetZ.format(dateAndTimeNow) + " ("
                + timezoneOffsetX.format(dateAndTimeNow) + ")" + " (" + timezoneOffsetZ1.format(dateAndTimeNow) + ")");
        Instant currentUtcDateAndTime = Instant.now();// Get the current UTC date and time using Instant object
        LocalDateTime utcDateAndTimeNow = LocalDateTime.ofInstant(currentUtcDateAndTime, ZoneOffset.UTC);// Convert from
                                                                                                         // Instant
                                                                                                         // object to
                                                                                                         // LocalDateTime
                                                                                                         // object
        System.out.println("Current UTC Era: " + era1.format(utcDateAndTimeNow) + " (" + era2.format(utcDateAndTimeNow)
                + ")" + " (" + era3.format(utcDateAndTimeNow) + ")"); // Print the formatted date and time values in
                                                                      // current local date and time
        System.out.println(
                "Current UTC Year: " + year1.format(utcDateAndTimeNow) + " (" + year2.format(utcDateAndTimeNow) + ")");
        System.out.println("Current UTC Era Year: " + yearEra.format(utcDateAndTimeNow) + " ("
                + yearEra2.format(utcDateAndTimeNow) + ")");
        System.out.println("Current UTC Day of Year: " + dayOfYear.format(utcDateAndTimeNow));
        System.out.println("Current UTC Month of Year: " + monthOfYear.format(utcDateAndTimeNow) + " ("
                + monthOfYear2.format(utcDateAndTimeNow) + ")" + " (" + monthOfYear3.format(utcDateAndTimeNow) + ")"
                + " (" + monthOfYear4.format(utcDateAndTimeNow) + ")");
        System.out.println("Current UTC Day of Month: " + dayOfMonth.format(utcDateAndTimeNow));
        System.out.println("Current UTC Quarter: " + quarter.format(utcDateAndTimeNow) + " ("
                + quarter2.format(utcDateAndTimeNow) + ")" + " (" + quarter3.format(utcDateAndTimeNow) + ")");
        System.out.println("Current UTC ISO Week-based Year: " + weekBasedYear.format(utcDateAndTimeNow) + " ("
                + weekBasedYear2.format(utcDateAndTimeNow) + ")");
        System.out.println("Current UTC Week of Year: " + weekOfYear.format(utcDateAndTimeNow));
        System.out.println("Current UTC Week of Month: " + weekOfMonth.format(utcDateAndTimeNow));
        System.out.println("Current UTC Day of Week: " + dayOfWeek.format(utcDateAndTimeNow) + " ("
                + dayOfWeek2.format(utcDateAndTimeNow) + ")" + " (" + dayOfWeek3.format(utcDateAndTimeNow) + ")");
        System.out.println("Current UTC Local Day of Week: " + localDayOfWeek.format(utcDateAndTimeNow) + " ("
                + localDayOfWeek2.format(utcDateAndTimeNow) + ")" + " (" + localDayOfWeek3.format(utcDateAndTimeNow)
                + ")" + " (" + localDayOfWeek4.format(utcDateAndTimeNow) + ")");
        System.out.println("Current UTC Local Week of Month: " + localWeekOfMonth.format(utcDateAndTimeNow));
        System.out.println("Current UTC AM/PM: " + amPm.format(utcDateAndTimeNow));
        System.out.println("Current UTC 12 Hour Format " + hour12.format(utcDateAndTimeNow));
        System.out.println("Current UTC 0-11 Hour Format: " + hour0_11.format(utcDateAndTimeNow));
        System.out.println("Current UTC 24 Hour Format: " + hour24.format(utcDateAndTimeNow));
        System.out.println("Current UTC Hour of Day: " + hourOfDay.format(utcDateAndTimeNow));
        System.out.println("Current UTC Minute: " + minute1.format(utcDateAndTimeNow));
        System.out.println("Current UTC Second: " + second1.format(utcDateAndTimeNow));
        System.out.println("Current UTC Fraction of Second: " + fractionOfSecond.format(utcDateAndTimeNow));
        System.out.println("Current UTC Millisecond of Day: " + millisecondOfDay.format(utcDateAndTimeNow));
        System.out.println("Current UTC Nanosecond: " + nanosecondOfSecond.format(utcDateAndTimeNow));
        System.out.println("Current UTC Nanosecond of Day: " + nanosecondOfDay.format(utcDateAndTimeNow));
    }
}
