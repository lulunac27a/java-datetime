<%@ page contentType="text/html" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Scanner" %>
<html>

<head>
    <title>Java date and time output in all supported formats</title>
</head>

<body>
    <%
int year = Integer.parseInt(request.getParameter("year"));
int month = Integer.parseInt(request.getParameter("month"));
int day = Integer.parseInt(request.getParameter("day"));
int hour = Integer.parseInt(request.getParameter("hour"));
int minute = Integer.parseInt(request.getParameter("minute"));
int second = Integer.parseInt(request.getParameter("second"));
GregorianCalendar datetime = new GregorianCalendar(year, month, day, hour, minute, second); // Get the date and time values based on user entered input
LocalDateTime dateandtime = LocalDateTime.of(year, month, day, hour, minute, second); // Convert datetime GregorianCalendar object to LocalDateTime object named dateandtime without time zone information
DateTimeFormatter era1 = DateTimeFormatter.ofPattern("GGG"); // Format the date and time values with specified pattern
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
%>
    <%= "Era: " + era1.format(dateandtime) + " (" + era2.format(dateandtime) + ")" + " (" + era3.format(dateandtime) + ")" %><br>
    <%-- Print the date and time values with formatted date and time pattern --%><br>
    <%= "Year: " + year1.format(dateandtime) + " (" + year2.format(dateandtime) + ")" %><br>
    <%= "Era Year: " + yearera.format(dateandtime) + " (" + yearera2.format(dateandtime) + ")" %><br>
    <%= "Day of Year: " + dayofyear.format(dateandtime) %><br>
    <%= "Month of Year: " + monthofyear.format(dateandtime) + " (" + monthofyear2.format(dateandtime) + ")" + " (" + monthofyear3.format(dateandtime) + ")" + " (" + monthofyear4.format(dateandtime) + ")" %><br>
    <%= "Day of Month: " + dayofmonth.format(dateandtime) %><br>
    <%= "Quarter: " + quarter.format(dateandtime) + " (" + quarter2.format(dateandtime) + ")" + " (" + quarter3.format(dateandtime) + ")" %><br>
    <%= "ISO Week-based Year: " + yearweek.format(dateandtime) + " (" + yearweek2.format(dateandtime) + ")" %><br>
    <%= "Week of Year: " + weekyear.format(dateandtime) %><br>
    <%= "Week of Month: " + weekofmonth.format(dateandtime) %><br>
    <%= "Day of Week: " + dayofweek.format(dateandtime) + " (" + dayofweek2.format(dateandtime) + ")" + " (" + dayofweek3.format(dateandtime) + ")" %><br>
    <%= "Local Day of Week: " + localdayofweek.format(dateandtime) + " (" + localdayofweek2.format(dateandtime) + ")" + " (" + localdayofweek3.format(dateandtime) + ")" + " (" + localdayofweek4.format(dateandtime) + ")" %><br>
    <%= "Local Week of Month: " + localweekofmonth.format(dateandtime) %><br>
    <%= "AM/PM: " + ampm.format(dateandtime) %><br>
    <%= "12 Hour Format " + hour12.format(dateandtime) %><br>
    <%= "0-11 Hour Format: " + hour011.format(dateandtime) %><br>
    <%= "24 Hour Format: " + hour24.format(dateandtime) %><br>
    <%= "Hour of Day: " + hourofday.format(dateandtime) %><br>
    <%= "Minute: " + minute1.format(dateandtime) %><br>
    <%= "Second: " + second1.format(dateandtime) %><br>
    <%= "Fraction of Second: " + fractionofsecond.format(dateandtime) %><br>
    <%= "Millisecond of Day: " + milliofday.format(dateandtime) %><br>
    <%= "Nanosecond: " + nanoofsecond.format(dateandtime) %><br>
    <%= "Nanosecond of Day: " + nanoofday.format(dateandtime) %><br>
</body>

</html>