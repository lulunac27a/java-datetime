import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class datetime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input the date and time values
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.print("Day: ");
        int day = sc.nextInt();
        System.out.print("Hour: ");
        int hour = sc.nextInt();
        System.out.print("Minute: ");
        int minute = sc.nextInt();
        System.out.print("Second: ");
        int second = sc.nextInt();
        GregorianCalendar datetime = new GregorianCalendar(year, month, day, hour, minute, second); // Get the date and
                                                                                                    // time values based
                                                                                                    // on user entered
                                                                                                    // input
        LocalDateTime dateandtime = LocalDateTime.of(year, month, day, hour, minute, second); // Convert datetime
                                                                                              // GregorianCalendar
                                                                                              // object to LocalDateTime
                                                                                              // object named
                                                                                              // dateandtime without
                                                                                              // time zone information
        DateTimeFormatter era1 = DateTimeFormatter.ofPattern("GGG"); // Format the date and time values with specified
                                                                     // pattern
        DateTimeFormatter era2 = DateTimeFormatter.ofPattern("GGGG");
        DateTimeFormatter era3 = DateTimeFormatter.ofPattern("GGGGG");
        DateTimeFormatter year1 = DateTimeFormatter.ofPattern("uu");
        DateTimeFormatter year2 = DateTimeFormatter.ofPattern("uuuu");
        DateTimeFormatter yearera = DateTimeFormatter.ofPattern("uu");
        DateTimeFormatter yearera2 = DateTimeFormatter.ofPattern("uuuu");
        DateTimeFormatter dayofyear = DateTimeFormatter.ofPattern("D");
        DateTimeFormatter monthofyear = DateTimeFormatter.ofPattern("M");
        DateTimeFormatter monthofyear2 = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter monthofyear3 = DateTimeFormatter.ofPattern("MMMM");
        DateTimeFormatter monthofyear4 = DateTimeFormatter.ofPattern("MMMMM");
        DateTimeFormatter dayofmonth = DateTimeFormatter.ofPattern("d");
        DateTimeFormatter quarter = DateTimeFormatter.ofPattern("q");
        DateTimeFormatter quarter2 = DateTimeFormatter.ofPattern("qqq");
        DateTimeFormatter quarter3 = DateTimeFormatter.ofPattern("qqqq");
        DateTimeFormatter yearweek = DateTimeFormatter.ofPattern("YY");
        DateTimeFormatter yearweek2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter weekyear = DateTimeFormatter.ofPattern("w");
        DateTimeFormatter weekofmonth = DateTimeFormatter.ofPattern("W");
        DateTimeFormatter dayofweek = DateTimeFormatter.ofPattern("E");
        DateTimeFormatter dayofweek2 = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter dayofweek3 = DateTimeFormatter.ofPattern("EEEEE");
        DateTimeFormatter localdayofweek = DateTimeFormatter.ofPattern("e");
        DateTimeFormatter localdayofweek2 = DateTimeFormatter.ofPattern("eee");
        DateTimeFormatter localdayofweek3 = DateTimeFormatter.ofPattern("eeee");
        DateTimeFormatter localdayofweek4 = DateTimeFormatter.ofPattern("eeeee");
        DateTimeFormatter localweekofmonth = DateTimeFormatter.ofPattern("F");
        DateTimeFormatter ampm = DateTimeFormatter.ofPattern("a");
        DateTimeFormatter hour12 = DateTimeFormatter.ofPattern("h");
        DateTimeFormatter hour011 = DateTimeFormatter.ofPattern("K");
        DateTimeFormatter hour24 = DateTimeFormatter.ofPattern("k");
        DateTimeFormatter hourofday = DateTimeFormatter.ofPattern("H");
        DateTimeFormatter minute1 = DateTimeFormatter.ofPattern("m");
        DateTimeFormatter second1 = DateTimeFormatter.ofPattern("s");
        DateTimeFormatter fractionofsecond = DateTimeFormatter.ofPattern("SSSSSSSSS");
        DateTimeFormatter milliofday = DateTimeFormatter.ofPattern("A");
        DateTimeFormatter nanoofsecond = DateTimeFormatter.ofPattern("n");
        DateTimeFormatter nanoofday = DateTimeFormatter.ofPattern("N");
        DateTimeFormatter timezoneid2 = DateTimeFormatter.ofPattern("VV");
        DateTimeFormatter timezonename = DateTimeFormatter.ofPattern("z");
        DateTimeFormatter timezonename2 = DateTimeFormatter.ofPattern("zz");
        DateTimeFormatter timezoneoffset = DateTimeFormatter.ofPattern("OOOO");
        DateTimeFormatter timezoneoffsetz = DateTimeFormatter.ofPattern("XXXXX");
        DateTimeFormatter timezoneoffsetx = DateTimeFormatter.ofPattern("xxxxx");
        DateTimeFormatter timezoneoffset2 = DateTimeFormatter.ofPattern("ZZZZZ");
        System.out.println("Era: " + era1.format(dateandtime) + " (" + era2.format(dateandtime) + ")" + " ("
                + era3.format(dateandtime) + ")"); // Print the date and time values with formatted date and time
                                                   // pattern

        System.out.println("Year: " + year1.format(dateandtime) + " (" + year2.format(dateandtime) + ")");
        System.out.println("Era Year: " + yearera.format(dateandtime) + " (" + yearera2.format(dateandtime) + ")");
        System.out.println("Day of Year: " + dayofyear.format(dateandtime));
        System.out.println("Month of Year: " + monthofyear.format(dateandtime) + " (" + monthofyear2.format(dateandtime)
                + ")" + " (" + monthofyear3.format(dateandtime) + ")" + " (" + monthofyear4.format(dateandtime) + ")");
        System.out.println("Day of Month: " + dayofmonth.format(dateandtime));
        System.out.println("Quarter: " + quarter.format(dateandtime) + " (" + quarter2.format(dateandtime) + ")" + " ("
                + quarter3.format(dateandtime) + ")");
        System.out.println(
                "ISO Week-based Year: " + yearweek.format(dateandtime) + " (" + yearweek2.format(dateandtime) + ")");
        System.out.println("Week of Year: " + weekyear.format(dateandtime));
        System.out.println("Week of Month: " + weekofmonth.format(dateandtime));
        System.out.println("Day of Week: " + dayofweek.format(dateandtime) + " (" + dayofweek2.format(dateandtime) + ")"
                + " (" + dayofweek3.format(dateandtime) + ")");
        System.out.println("Local Day of Week: " + localdayofweek.format(dateandtime) + " ("
                + localdayofweek2.format(dateandtime) + ")" + " (" + localdayofweek3.format(dateandtime) + ")" + " ("
                + localdayofweek4.format(dateandtime) + ")");
        System.out.println("Local Week of Month: " + localweekofmonth.format(dateandtime));
        System.out.println("AM/PM: " + ampm.format(dateandtime));
        System.out.println("12 Hour Format " + hour12.format(dateandtime));
        System.out.println("0-11 Hour Format: " + hour011.format(dateandtime));
        System.out.println("24 Hour Format: " + hour24.format(dateandtime));
        System.out.println("Hour of Day: " + hourofday.format(dateandtime));
        System.out.println("Minute: " + minute1.format(dateandtime));
        System.out.println("Second: " + second1.format(dateandtime));
        System.out.println("Fraction of Second: " + fractionofsecond.format(dateandtime));
        System.out.println("Millisecond of Day: " + milliofday.format(dateandtime));
        System.out.println("Nanosecond: " + nanoofsecond.format(dateandtime));
        System.out.println("Nanosecond of Day: " + nanoofday.format(dateandtime));
        LocalDateTime dateandtimenow = LocalDateTime.of(year, month, day, hour, minute, second); // Get the current date
                                                                                                 // and time based on
                                                                                                 // local computer date
                                                                                                 // and time
        DateTimeFormatter nowera1 = DateTimeFormatter.ofPattern("GGG"); // Format the current local date and time values
        DateTimeFormatter nowera2 = DateTimeFormatter.ofPattern("GGGG");
        DateTimeFormatter nowera3 = DateTimeFormatter.ofPattern("GGGGG");
        DateTimeFormatter nowyear1 = DateTimeFormatter.ofPattern("uu");
        DateTimeFormatter nowyear2 = DateTimeFormatter.ofPattern("uuuu");
        DateTimeFormatter nowyearera = DateTimeFormatter.ofPattern("uu");
        DateTimeFormatter nowyearera2 = DateTimeFormatter.ofPattern("uuuu");
        DateTimeFormatter nowdayofyear = DateTimeFormatter.ofPattern("D");
        DateTimeFormatter nowmonthofyear = DateTimeFormatter.ofPattern("M");
        DateTimeFormatter nowmonthofyear2 = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter nowmonthofyear3 = DateTimeFormatter.ofPattern("MMMM");
        DateTimeFormatter nowmonthofyear4 = DateTimeFormatter.ofPattern("MMMMM");
        DateTimeFormatter nowdayofmonth = DateTimeFormatter.ofPattern("d");
        DateTimeFormatter nowquarter = DateTimeFormatter.ofPattern("q");
        DateTimeFormatter nowquarter2 = DateTimeFormatter.ofPattern("qqq");
        DateTimeFormatter nowquarter3 = DateTimeFormatter.ofPattern("qqqq");
        DateTimeFormatter nowyearweek = DateTimeFormatter.ofPattern("YY");
        DateTimeFormatter nowyearweek2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter nowweekyear = DateTimeFormatter.ofPattern("w");
        DateTimeFormatter nowweekofmonth = DateTimeFormatter.ofPattern("W");
        DateTimeFormatter nowdayofweek = DateTimeFormatter.ofPattern("E");
        DateTimeFormatter nowdayofweek2 = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter nowdayofweek3 = DateTimeFormatter.ofPattern("EEEEE");
        DateTimeFormatter nowlocaldayofweek = DateTimeFormatter.ofPattern("e");
        DateTimeFormatter nowlocaldayofweek2 = DateTimeFormatter.ofPattern("eee");
        DateTimeFormatter nowlocaldayofweek3 = DateTimeFormatter.ofPattern("eeee");
        DateTimeFormatter nowlocaldayofweek4 = DateTimeFormatter.ofPattern("eeeee");
        DateTimeFormatter nowlocalweekofmonth = DateTimeFormatter.ofPattern("F");
        DateTimeFormatter nowampm = DateTimeFormatter.ofPattern("a");
        DateTimeFormatter nowhour12 = DateTimeFormatter.ofPattern("h");
        DateTimeFormatter nowhour011 = DateTimeFormatter.ofPattern("K");
        DateTimeFormatter nowhour24 = DateTimeFormatter.ofPattern("k");
        DateTimeFormatter nowhourofday = DateTimeFormatter.ofPattern("H");
        DateTimeFormatter nowminute1 = DateTimeFormatter.ofPattern("m");
        DateTimeFormatter nowsecond1 = DateTimeFormatter.ofPattern("s");
        DateTimeFormatter nowfractionofsecond = DateTimeFormatter.ofPattern("SSSSSSSSS");
        DateTimeFormatter nowmilliofday = DateTimeFormatter.ofPattern("A");
        DateTimeFormatter nownanoofsecond = DateTimeFormatter.ofPattern("n");
        DateTimeFormatter nownanoofday = DateTimeFormatter.ofPattern("N");
        DateTimeFormatter nowtimezoneid2 = DateTimeFormatter.ofPattern("VV");
        DateTimeFormatter nowtimezonename = DateTimeFormatter.ofPattern("z");
        DateTimeFormatter nowtimezonename2 = DateTimeFormatter.ofPattern("zz");
        DateTimeFormatter nowtimezoneoffset = DateTimeFormatter.ofPattern("OOOO");
        DateTimeFormatter nowtimezoneoffsetz = DateTimeFormatter.ofPattern("XXXXX");
        DateTimeFormatter nowtimezoneoffsetx = DateTimeFormatter.ofPattern("xxxxx");
        DateTimeFormatter nowtimezoneoffset2 = DateTimeFormatter.ofPattern("ZZZZZ");
        System.out.println("Current Era: " + nowera1.format(dateandtimenow) + " (" + nowera2.format(dateandtimenow)
                + ")" + " (" + nowera3.format(dateandtimenow) + ")"); // Print the formatted date and time values in
                                                                      // current local date and time
        System.out.println(
                "Current Year: " + nowyear1.format(dateandtimenow) + " (" + nowyear2.format(dateandtimenow) + ")");
        System.out.println("Current Era Year: " + nowyearera.format(dateandtimenow) + " ("
                + nowyearera2.format(dateandtimenow) + ")");
        System.out.println("Current Day of Year: " + nowdayofyear.format(dateandtimenow));
        System.out.println("Month of Year: " + nowmonthofyear.format(dateandtimenow) + " ("
                + nowmonthofyear2.format(dateandtimenow) + ")" + " (" + nowmonthofyear3.format(dateandtimenow) + ")"
                + " (" + nowmonthofyear4.format(dateandtimenow) + ")");
        System.out.println("Current Day of Month: " + nowdayofmonth.format(dateandtimenow));
        System.out.println("Current Quarter: " + nowquarter.format(dateandtimenow) + " ("
                + nowquarter2.format(dateandtimenow) + ")" + " (" + nowquarter3.format(dateandtimenow) + ")");
        System.out.println("ISO Week-based Year: " + nowyearweek.format(dateandtimenow) + " ("
                + nowyearweek2.format(dateandtimenow) + ")");
        System.out.println("Current Week of Year: " + nowweekyear.format(dateandtimenow));
        System.out.println("Current Week of Month: " + nowweekofmonth.format(dateandtimenow));
        System.out.println("Current Day of Week: " + nowdayofweek.format(dateandtimenow) + " ("
                + nowdayofweek2.format(dateandtimenow) + ")" + " (" + nowdayofweek3.format(dateandtimenow) + ")");
        System.out.println("Current Local Day of Week: " + nowlocaldayofweek.format(dateandtimenow) + " ("
                + nowlocaldayofweek2.format(dateandtimenow) + ")" + " (" + nowlocaldayofweek3.format(dateandtimenow)
                + ")" + " (" + nowlocaldayofweek4.format(dateandtimenow) + ")");
        System.out.println("Current Local Week of Month: " + nowlocalweekofmonth.format(dateandtimenow));
        System.out.println("Current AM/PM: " + nowampm.format(dateandtimenow));
        System.out.println("Current 12 Hour Format " + nowhour12.format(dateandtimenow));
        System.out.println("Current 0-11 Hour Format: " + nowhour011.format(dateandtimenow));
        System.out.println("Current 24 Hour Format: " + nowhour24.format(dateandtimenow));
        System.out.println("Current Hour of Day: " + nowhourofday.format(dateandtimenow));
        System.out.println("Current Minute: " + nowminute1.format(dateandtimenow));
        System.out.println("Current Second: " + nowsecond1.format(dateandtimenow));
        System.out.println("Current Fraction of Second: " + nowfractionofsecond.format(dateandtimenow));
        System.out.println("Current Millisecond of Day: " + nowmilliofday.format(dateandtimenow));
        System.out.println("Current Nanosecond: " + nownanoofsecond.format(dateandtimenow));
        System.out.println("Current Nanosecond of Day: " + nownanoofday.format(dateandtimenow));
    }
}
