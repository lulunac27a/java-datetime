<!DOCTYPE html>
<head>
<link rel = "stylesheet" type = "text/css" href = "datetime.css">
<title>
Get date and time in ColdFusion
</title>
<h1>
Enter date and time values
</h1>
</head>
<body>
<cfset dateAndTimeNow = now()><!---set input form values to current date and time--->
<cfset dateAndTimeNowUtc = dateConvert("local2Utc", dateAndTimeNow)>
<cfform method = "post"><!---send post request when form is submitted--->
    Year: 
    <cfinput type = "text" id = "year" name = "year" value = "#Year(dateAndTimeNow)#"
             validate = "integer">
    <br>
    Month: 
    <cfinput type = "text" id = "month" name = "month" value = "#Month(dateAndTimeNow)#"
             validate = "integer" range = "1,12">
    <br>
    Day: 
    <cfinput type = "text" id = "day" name = "day" value = "#Day(dateAndTimeNow)#"
             validate = "integer" range = "1,31">
    <br>
    Hour: 
    <cfinput type = "text" id = "hour" name = "hour" value = "#Hour(dateAndTimeNow)#"
             validate = "integer" range = "0,23">
    <br>
    Minute: 
    <cfinput type = "text" id = "minute" name = "minute" value = "#Minute(dateAndTimeNow)#"
             validate = "integer" range = "0,59">
    <br>
    Second: 
    <cfinput type = "text" id = "second" name = "second" value = "#Second(dateAndTimeNow)#"
             validate = "integer" range = "0,59">
    <br>
    Millisecond: 
    <cfinput type = "text" id = "millisecond" name = "millisecond" 
             value = "#Millisecond(dateAndTimeNow)#" validate = "integer" range = "0,999">
    <br>
    <input type = "submit" value = "Submit" name = "submit">
</cfform>
<cfif structKeyExists(form, "submit")><!---check if form is submitted--->
    <cfset enteredDate = CreateDateTime(form.year, form.month, form.day, form.hour, form.minute, form.second, form.millisecond)>
    <!---set entered date to form input values--->
    <!---output the date and time in all supported formats--->
    <cfoutput>
        Day of Month: 
        <span id = "output">#dateTimeFormat(enteredDate, "d")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Day of Week: 
        <span id = "output">#dateTimeFormat(enteredDate, "EEE")# (#dateTimeFormat(enteredDate, "EEEE")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Month: 
        <span id = "output">#dateTimeFormat(enteredDate, "m")# (#dateTimeFormat(enteredDate, "mmm")#
        ) (#dateTimeFormat(enteredDate, "mmmm")#) (#dateTimeFormat(enteredDate, "M")#)
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Day of Year: 
        <span id = "output">#dateTimeFormat(enteredDate, "D")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Year: 
        <span id = "output">#dateTimeFormat(enteredDate, "yyyy")# (#dateTimeFormat(enteredDate, "yy")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Week Year: 
        <span id = "output">#dateTimeFormat(enteredDate, "YYYY")# (#dateTimeFormat(enteredDate, "Y")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Period/Era: 
        <span id = "output">#dateTimeFormat(enteredDate, "G")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        12 Hour Format: 
        <span id = "output">#dateTimeFormat(enteredDate, "h")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        24 Hour Format: 
        <span id = "output">#dateTimeFormat(enteredDate, "H")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Minute: 
        <span id = "output">#dateTimeFormat(enteredDate, "n")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Second: 
        <span id = "output">#dateTimeFormat(enteredDate, "s")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Milliseconds: 
        <span id = "output">#dateTimeFormat(enteredDate, "l")# (#dateTimeFormat(enteredDate, "L")#)
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Time Marker String: 
        <span id = "output">#dateTimeFormat(enteredDate, "t")# (#dateTimeFormat(enteredDate, "tt")#)
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Week of Year: 
        <span id = "output">#dateTimeFormat(enteredDate, "w")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Week of Month: 
        <span id = "output">#dateTimeFormat(enteredDate, "W")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        ISO Format: 
        <span id = "output">#dateTimeFormat(enteredDate, "iso")#
        </span>
    </cfoutput>
    <br>
<cfelse><!---if form is not submitted any input data--->
    <!---output the current date and time in all supported formats--->
    <cfoutput>
        Current Day of Month: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "d")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Day of Week: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "EEE")# (#dateTimeFormat(dateAndTimeNow, "EEEE")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Month: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "m")# (#dateTimeFormat(dateAndTimeNow, "mmm")#
        ) (#dateTimeFormat(dateAndTimeNow, "mmmm")#) (#dateTimeFormat(dateAndTimeNow, "M")#)
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Day of Year: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "D")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Year: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "yyyy")# (#dateTimeFormat(dateAndTimeNow, "yy")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Week Year: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "YYYY")# (#dateTimeFormat(dateAndTimeNow, "Y")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Period/Era: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "G")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current 12 Hour Format: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "h")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current 24 Hour Format: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "H")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Minute: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "n")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Second: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "s")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Milliseconds: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "l")# (#dateTimeFormat(dateAndTimeNow, "L")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Time Marker String: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "t")# (#dateTimeFormat(dateAndTimeNow, "tt")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Week of Year: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "w")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current Week of Month: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "W")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current ISO Format: 
        <span id = "output">#dateTimeFormat(dateAndTimeNow, "iso")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Day of Month: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "d")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Day of Week: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "EEE")# (#dateTimeFormat(dateAndTimeNowUtc, "EEEE")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Month: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "m")# (#dateTimeFormat(dateAndTimeNowUtc, "mmm")#
        ) (#dateTimeFormat(dateAndTimeNowUtc, "mmmm")#) (#dateTimeFormat(dateAndTimeNowUtc, "M")#)
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Day of Year: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "D")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Year: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "yyyy")# (#dateTimeFormat(dateAndTimeNowUtc, "yy")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Week Year: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "YYYY")# (#dateTimeFormat(dateAndTimeNowUtc, "Y")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Period/Era: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "G")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC 12 Hour Format: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "h")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC 24 Hour Format: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "H")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Minute: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "n")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Second: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "s")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Milliseconds: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "l")# (#dateTimeFormat(dateAndTimeNowUtc, "L")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Time Marker String: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "t")# (#dateTimeFormat(dateAndTimeNowUtc, "tt")#
        )
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Week of Year: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "w")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC Week of Month: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "W")#
        </span>
    </cfoutput>
    <br>
    <cfoutput>
        Current UTC ISO Format: 
        <span id = "output">#dateTimeFormat(dateAndTimeNowUtc, "iso")#
        </span>
    </cfoutput>
    <br>
</cfif>