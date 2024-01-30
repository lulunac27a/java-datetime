<%@ page contentType="text/html" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Scanner" %>
<html>

<head>
    <link rel="stylesheet" type="text/css" href="datetime.css">
    <title>Java date and time output in all supported formats</title>
    <h1>Output:</h1>
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
LocalDateTime enteredDateAndTime = LocalDateTime.of(year, month, day, hour, minute, second).withNano(millisecond * 1000000 + microsecond * 1000 + nanosecond); // Convert datetime of GregorianCalendar object to LocalDateTime object named enteredDateAndTime without time zone information
DateTimeFormatter era1 = DateTimeFormatter.ofPattern("GGG"); // Format the date and time values with specified pattern
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
%>
    Era: <b><%= era1.format(enteredDateAndTime) + " (" + era2.format(enteredDateAndTime) + ")" + " (" + era3.format(enteredDateAndTime) + ")" %></b><br/>
    <%-- Print the date and time values with formatted date and time pattern --%></b><br/>
    Year: <b><%= year1.format(enteredDateAndTime) + " (" + year2.format(enteredDateAndTime) + ")" %></b><br/>
    Era Year: <b><%= yearEra.format(enteredDateAndTime) + " (" + yearEra2.format(enteredDateAndTime) + ")" %></b><br/>
    Day of Year: <b><%= dayOfYear.format(enteredDateAndTime) %></b><br/>
    Month of Year: <b><%= monthOfYear.format(enteredDateAndTime) + " (" + monthOfYear2.format(enteredDateAndTime) + ")" + " (" + monthOfYear3.format(enteredDateAndTime) + ")" + " (" + monthOfYear4.format(enteredDateAndTime) + ")" %></b><br/>
    Day of Month: <b><%= dayOfMonth.format(enteredDateAndTime) %></b><br/>
    Quarter: <b><%= quarter.format(enteredDateAndTime) + " (" + quarter2.format(enteredDateAndTime) + ")" + " (" + quarter3.format(enteredDateAndTime) + ")" %></b><br/>
    ISO Week-based Year: <b><%= weekBasedYear.format(enteredDateAndTime) + " (" + weekBasedYear2.format(enteredDateAndTime) + ")" %></b><br/>
    Week of Year: <b><%= weekOfYear.format(enteredDateAndTime) %></b><br/>
    Week of Month: <b><%= weekOfMonth.format(enteredDateAndTime) %></b><br/>
    Day of Week: <b><%= dayOfWeek.format(enteredDateAndTime) + " (" + dayOfWeek2.format(enteredDateAndTime) + ")" + " (" + dayOfWeek3.format(enteredDateAndTime) + ")" %></b><br/>
    Local Day of Week: <b><%= localDayOfWeek.format(enteredDateAndTime) + " (" + localDayOfWeek2.format(enteredDateAndTime) + ")" + " (" + localDayOfWeek3.format(enteredDateAndTime) + ")" + " (" + localDayOfWeek4.format(enteredDateAndTime) + ")" %></b><br/>
    Local Week of Month: <b><%= localWeekOfMonth.format(enteredDateAndTime) %></b><br/>
    AM/PM: <b><%= amPm.format(enteredDateAndTime) %></b><br/>
    12 Hour Format: <b><%= hour12.format(enteredDateAndTime) %></b><br/>
    0-11 Hour Format: <b><%= hour0_11.format(enteredDateAndTime) %></b><br/>
    24 Hour Format: <b><%= hour24.format(enteredDateAndTime) %></b><br/>
    Hour of Day: <b><%= hourOfDay.format(enteredDateAndTime) %></b><br/>
    Minute: <b><%= minute1.format(enteredDateAndTime) %></b><br/>
    Second: <b><%= second1.format(enteredDateAndTime) %></b><br/>
    Fraction of Second: <b><%= fractionOfSecond.format(enteredDateAndTime) %></b><br/>
    Millisecond of Day: <b><%= millisecondOfDay.format(enteredDateAndTime) %></b><br/>
    Nanosecond: <b><%= nanosecondOfSecond.format(enteredDateAndTime) %></b><br/>
    Nanosecond of Day: <b><%= nanosecondOfDay.format(enteredDateAndTime) %></b><br/>
</body>

</html>