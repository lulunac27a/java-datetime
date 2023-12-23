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
int millisecond = Integer.parseInt(request.getParameter("millisecond"));
int microsecond = Integer.parseInt(request.getParameter("microsecond"));
int nanosecond = Integer.parseInt(request.getParameter("nanosecond"));
LocalDateTime enteredDateAndTime = LocalDateTime.of(year, month, day, hour, minute, second).withNano(millisecond * 1000000 + microsecond * 1000 + nanosecond); // Convert datetime GregorianCalendar object to LocalDateTime object named enteredDateAndTime without time zone information
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
    <%= "Era: " + era1.format(enteredDateAndTime) + " (" + era2.format(enteredDateAndTime) + ")" + " (" + era3.format(enteredDateAndTime) + ")" %><br>
    <%-- Print the date and time values with formatted date and time pattern --%><br>
    <%= "Year: " + year1.format(enteredDateAndTime) + " (" + year2.format(enteredDateAndTime) + ")" %><br>
    <%= "Era Year: " + yearera.format(enteredDateAndTime) + " (" + yearera2.format(enteredDateAndTime) + ")" %><br>
    <%= "Day of Year: " + dayofyear.format(enteredDateAndTime) %><br>
    <%= "Month of Year: " + monthofyear.format(enteredDateAndTime) + " (" + monthofyear2.format(enteredDateAndTime) + ")" + " (" + monthofyear3.format(enteredDateAndTime) + ")" + " (" + monthofyear4.format(enteredDateAndTime) + ")" %><br>
    <%= "Day of Month: " + dayofmonth.format(enteredDateAndTime) %><br>
    <%= "Quarter: " + quarter.format(enteredDateAndTime) + " (" + quarter2.format(enteredDateAndTime) + ")" + " (" + quarter3.format(enteredDateAndTime) + ")" %><br>
    <%= "ISO Week-based Year: " + yearweek.format(enteredDateAndTime) + " (" + yearweek2.format(enteredDateAndTime) + ")" %><br>
    <%= "Week of Year: " + weekyear.format(enteredDateAndTime) %><br>
    <%= "Week of Month: " + weekofmonth.format(enteredDateAndTime) %><br>
    <%= "Day of Week: " + dayofweek.format(enteredDateAndTime) + " (" + dayofweek2.format(enteredDateAndTime) + ")" + " (" + dayofweek3.format(enteredDateAndTime) + ")" %><br>
    <%= "Local Day of Week: " + localdayofweek.format(enteredDateAndTime) + " (" + localdayofweek2.format(enteredDateAndTime) + ")" + " (" + localdayofweek3.format(enteredDateAndTime) + ")" + " (" + localdayofweek4.format(enteredDateAndTime) + ")" %><br>
    <%= "Local Week of Month: " + localweekofmonth.format(enteredDateAndTime) %><br>
    <%= "AM/PM: " + ampm.format(enteredDateAndTime) %><br>
    <%= "12 Hour Format " + hour12.format(enteredDateAndTime) %><br>
    <%= "0-11 Hour Format: " + hour011.format(enteredDateAndTime) %><br>
    <%= "24 Hour Format: " + hour24.format(enteredDateAndTime) %><br>
    <%= "Hour of Day: " + hourofday.format(enteredDateAndTime) %><br>
    <%= "Minute: " + minute1.format(enteredDateAndTime) %><br>
    <%= "Second: " + second1.format(enteredDateAndTime) %><br>
    <%= "Fraction of Second: " + fractionofsecond.format(enteredDateAndTime) %><br>
    <%= "Millisecond of Day: " + milliofday.format(enteredDateAndTime) %><br>
    <%= "Nanosecond: " + nanoofsecond.format(enteredDateAndTime) %><br>
    <%= "Nanosecond of Day: " + nanoofday.format(enteredDateAndTime) %><br>
</body>

</html>