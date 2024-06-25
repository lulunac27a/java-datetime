<%@ page contentType="text/html" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Scanner" %>
<!DOCTYPE html>
<html lang="en">

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
DateTimeFormatter era1 = DateTimeFormatter.ofPattern("GGG"); // Format the date and time values with a specified pattern
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
    Era: <span id="output"><%= era1.format(enteredDateAndTime) + " (" + era2.format(enteredDateAndTime) + ")" + " (" + era3.format(enteredDateAndTime) + ")" %></span><br/>
    <%-- Print the date and time values with formatted date and time pattern --%><br/>
    Year: <span id="output"><%= year1.format(enteredDateAndTime) + " (" + year2.format(enteredDateAndTime) + ")" %></span><br/>
    Era Year: <span id="output"><%= yearEra.format(enteredDateAndTime) + " (" + yearEra2.format(enteredDateAndTime) + ")" %></span><br/>
    Day of Year: <span id="output"><%= dayOfYear.format(enteredDateAndTime) %></span><br/>
    Month of Year: <span id="output"><%= monthOfYear.format(enteredDateAndTime) + " (" + monthOfYear2.format(enteredDateAndTime) + ")" + " (" + monthOfYear3.format(enteredDateAndTime) + ")" + " (" + monthOfYear4.format(enteredDateAndTime) + ")" %></span><br/>
    Day of Month: <span id="output"><%= dayOfMonth.format(enteredDateAndTime) %></span><br/>
    Quarter: <span id="output"><%= quarter.format(enteredDateAndTime) + " (" + quarter2.format(enteredDateAndTime) + ")" + " (" + quarter3.format(enteredDateAndTime) + ")" %></span><br/>
    ISO Week-based Year: <span id="output"><%= weekBasedYear.format(enteredDateAndTime) + " (" + weekBasedYear2.format(enteredDateAndTime) + ")" %></span><br/>
    Week of Year: <span id="output"><%= weekOfYear.format(enteredDateAndTime) %></span><br/>
    Week of Month: <span id="output"><%= weekOfMonth.format(enteredDateAndTime) %></span><br/>
    Day of Week: <span id="output"><%= dayOfWeek.format(enteredDateAndTime) + " (" + dayOfWeek2.format(enteredDateAndTime) + ")" + " (" + dayOfWeek3.format(enteredDateAndTime) + ")" %></span><br/>
    Local Day of Week: <span id="output"><%= localDayOfWeek.format(enteredDateAndTime) + " (" + localDayOfWeek2.format(enteredDateAndTime) + ")" + " (" + localDayOfWeek3.format(enteredDateAndTime) + ")" + " (" + localDayOfWeek4.format(enteredDateAndTime) + ")" %></span><br/>
    Local Week of Month: <span id="output"><%= localWeekOfMonth.format(enteredDateAndTime) %></span><br/>
    AM/PM: <span id="output"><%= amPm.format(enteredDateAndTime) %></span><br/>
    12 Hour Format: <span id="output"><%= hour12.format(enteredDateAndTime) %></span><br/>
    0-11 Hour Format: <span id="output"><%= hour0_11.format(enteredDateAndTime) %></span><br/>
    24 Hour Format: <span id="output"><%= hour24.format(enteredDateAndTime) %></span><br/>
    Hour of Day: <span id="output"><%= hourOfDay.format(enteredDateAndTime) %></span><br/>
    Minute: <span id="output"><%= minute1.format(enteredDateAndTime) %></span><br/>
    Second: <span id="output"><%= second1.format(enteredDateAndTime) %></span><br/>
    Fraction of Second: <span id="output"><%= fractionOfSecond.format(enteredDateAndTime) %></span><br/>
    Millisecond of Day: <span id="output"><%= millisecondOfDay.format(enteredDateAndTime) %></span><br/>
    Nanosecond: <span id="output"><%= nanosecondOfSecond.format(enteredDateAndTime) %></span><br/>
    Nanosecond of Day: <span id="output"><%= nanosecondOfDay.format(enteredDateAndTime) %></span><br/>
</body>

</html>