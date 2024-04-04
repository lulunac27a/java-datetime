<!DOCTYPE html>
<head>
<title>
Get date and time in ColdFusion
</title>
<h1>
Enter date and time values
</h1>
</head>
<body>
<cfset dateAndTimeNow = now()><!---set input form values to current date and time--->
<cfform method = "post"><!---send post request when form is submitted--->
    Year: 
    <cfinput type = "text" name = "year" value = "#Year(dateAndTimeNow)#" validate = "integer">
    <br/>
    Month: 
    <cfinput type = "text" name = "month" value = "#Month(dateAndTimeNow)#" validate = "integer">
    <br/>
    Day: 
    <cfinput type = "text" name = "day" value = "#Day(dateAndTimeNow)#" validate = "integer">
    <br/>
    Hour: 
    <cfinput type = "text" name = "hour" value = "#Hour(dateAndTimeNow)#" validate = "integer">
    <br/>
    Minute: 
    <cfinput type = "text" name = "minute" value = "#Minute(dateAndTimeNow)#" validate = "integer">
    <br/>
    Second: 
    <cfinput type = "text" name = "second" value = "#Second(dateAndTimeNow)#" validate = "integer">
    <br/>
    Millisecond: 
    <cfinput type = "text" name = "millisecond" value = "#Millisecond(dateAndTimeNow)#" 
             validate = "integer">
    <br/>
    <input type = "submit" value = "Submit" name = "submit">
</cfform>
<cfif structKeyExists(form, "submit")><!---check if form is submitted--->
    <cfset enteredDate = CreateDateTime(form.year, form.month, form.day, form.hour, form.minute, form.second, form.millisecond)>
<!---set entered date to form input values--->
    <!---output the date and time in all supported formats--->
    <cfoutput>Day of Month: #dateTimeFormat(enteredDate, "d")#</cfoutput>
    <br/>
    <cfoutput>Day of Week: #dateTimeFormat(enteredDate, "EEE")# (#dateTimeFormat(enteredDate, "EEEE")#)</cfoutput>
    <br/>
    <cfoutput>
        Month: #dateTimeFormat(enteredDate, "m")# (#dateTimeFormat(enteredDate, "mmm")#) (#dateTimeFormat(enteredDate, "mmmm")#
        ) (#dateTimeFormat(enteredDate, "M")#)
    </cfoutput>
    <br/>
    <cfoutput>Day of Year: #dateTimeFormat(enteredDate, "D")#</cfoutput>
    <br/>
    <cfoutput>Year: #dateTimeFormat(enteredDate, "yyyy")# (#dateTimeFormat(enteredDate, "yy")#)</cfoutput>
    <br/>
    <cfoutput>Week Year: #dateTimeFormat(enteredDate, "YYYY")# (#dateTimeFormat(enteredDate, "Y")#)</cfoutput>
    <br/>
    <cfoutput>Period/Era: #dateTimeFormat(enteredDate, "G")#</cfoutput>
    <br/>
    <cfoutput>12 Hour Format: #dateTimeFormat(enteredDate, "h")#</cfoutput>
    <br/>
    <cfoutput>24 Hour Format: #dateTimeFormat(enteredDate, "H")#</cfoutput>
    <br/>
    <cfoutput>Minute: #dateTimeFormat(enteredDate, "n")#</cfoutput>
    <br/>
    <cfoutput>Second: #dateTimeFormat(enteredDate, "s")#</cfoutput>
    <br/>
    <cfoutput>Milliseconds: #dateTimeFormat(enteredDate, "l")# (#dateTimeFormat(enteredDate, "L")#)</cfoutput>
    <br/>
    <cfoutput>Time Marker String: #dateTimeFormat(enteredDate, "t")# (#dateTimeFormat(enteredDate, "tt")#)</cfoutput>
    <br/>
    <cfoutput>Week of Year: #dateTimeFormat(enteredDate, "w")#</cfoutput>
    <br/>
    <cfoutput>Week of Month: #dateTimeFormat(enteredDate, "W")#</cfoutput>
    <br/>
    <cfoutput>ISO Format: #dateTimeFormat(enteredDate, "iso")#</cfoutput>
    <br/>
<cfelse><!---if form is not submitted any input data--->
    <!---output the current date and time in all supported formats--->
    <cfoutput>Current Day of Month: #dateTimeFormat(dateAndTimeNow, "d")#</cfoutput>
    <br/>
    <cfoutput>
        Current Day of Week: #dateTimeFormat(dateAndTimeNow, "EEE")# (#dateTimeFormat(dateAndTimeNow, "EEEE")#
        )
    </cfoutput>
    <br/>
    <cfoutput>
        Current Month: #dateTimeFormat(dateAndTimeNow, "m")# (#dateTimeFormat(dateAndTimeNow, "mmm")#
        ) (#dateTimeFormat(dateAndTimeNow, "mmmm")#) (#dateTimeFormat(dateAndTimeNow, "M")#)
    </cfoutput>
    <br/>
    <cfoutput>Current Day of Year: #dateTimeFormat(dateAndTimeNow, "D")#</cfoutput>
    <br/>
    <cfoutput>
        Current Year: #dateTimeFormat(dateAndTimeNow, "yyyy")# (#dateTimeFormat(dateAndTimeNow, "yy")#
        )
    </cfoutput>
    <br/>
    <cfoutput>
        Current Week Year: #dateTimeFormat(dateAndTimeNow, "YYYY")# (#dateTimeFormat(dateAndTimeNow, "Y")#
        )
    </cfoutput>
    <br/>
    <cfoutput>Current Period/Era: #dateTimeFormat(dateAndTimeNow, "G")#</cfoutput>
    <br/>
    <cfoutput>Current 12 Hour Format: #dateTimeFormat(dateAndTimeNow, "h")#</cfoutput>
    <br/>
    <cfoutput>Current 24 Hour Format: #dateTimeFormat(dateAndTimeNow, "H")#</cfoutput>
    <br/>
    <cfoutput>Current Minute: #dateTimeFormat(dateAndTimeNow, "n")#</cfoutput>
    <br/>
    <cfoutput>Current Second: #dateTimeFormat(dateAndTimeNow, "s")#</cfoutput>
    <br/>
    <cfoutput>
        Current Milliseconds: #dateTimeFormat(dateAndTimeNow, "l")# (#dateTimeFormat(dateAndTimeNow, "L")#
        )
    </cfoutput>
    <br/>
    <cfoutput>
        Current Time Marker String: #dateTimeFormat(dateAndTimeNow, "t")# (#dateTimeFormat(dateAndTimeNow, "tt")#
        )
    </cfoutput>
    <br/>
    <cfoutput>Current Week of Year: #dateTimeFormat(dateAndTimeNow, "w")#</cfoutput>
    <br/>
    <cfoutput>Current Week of Month: #dateTimeFormat(dateAndTimeNow, "W")#</cfoutput>
    <br/>
    <cfoutput>Current ISO Format: #dateTimeFormat(dateAndTimeNow, "iso")#</cfoutput>
    <br/>
</cfif>