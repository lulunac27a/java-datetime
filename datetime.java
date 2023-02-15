import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class datetime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // input date and time values
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
																									// time values
		LocalDateTime dateandtime = LocalDateTime.of(year, month, day, hour, minute, second);
		DateTimeFormatter era1 = DateTimeFormatter.ofPattern("GGG");
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
				+ era3.format(dateandtime) + ")");

		System.out.println("Year: " + year1.format(dateandtime) + " (" + year2.format(dateandtime) + ")");
		System.out.println("Era Year: " + yearera.format(dateandtime) + " (" + yearera2.format(dateandtime) + ")");
		System.out.println("Day of Year: " + dayofyear.format(dateandtime));
		System.out.println(
				"Month of Year: " + monthofyear.format(dateandtime) + " (" + monthofyear2.format(dateandtime) + ")"
						+ " (" + monthofyear3.format(dateandtime) + ")" + " (" + monthofyear4.format(dateandtime)
						+ ")");
		System.out.println("Day of Month: " + dayofmonth.format(dateandtime));
		System.out.println("Quarter: " + quarter.format(dateandtime) + " (" + quarter2.format(dateandtime) + ")" + " ("
				+ quarter3.format(dateandtime) + ")");
		System.out.println(
				"ISO Week-based Year: " + yearweek.format(dateandtime) + " (" + yearweek2.format(dateandtime) + ")");
		System.out.println("Week of Year: " + weekyear.format(dateandtime));
		System.out.println("Week of Month: " + weekofmonth.format(dateandtime));
		System.out.println("Day of Week: " + dayofweek.format(dateandtime) + " (" + dayofweek2.format(dateandtime) + ")"
				+ " ("
				+ dayofweek3.format(dateandtime) + ")");
		System.out.println("Local Day of Week: " + localdayofweek.format(dateandtime) + " ("
				+ localdayofweek2.format(dateandtime) + ")"
				+ " ("
				+ localdayofweek3.format(dateandtime) + ")" + " ("
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
	}
}
