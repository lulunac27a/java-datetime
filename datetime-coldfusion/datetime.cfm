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
<cfset dateAndTimeNow = now()>
<cfform method = "post">
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
<cfif structKeyExists(form, "submit")>
    <cfset enteredDate = CreateDateTime(form.year, form.month, form.day, form.hour, form.minute, form.second, form.millisecond)>
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
</cfif>