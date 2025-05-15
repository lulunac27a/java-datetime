import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*

object datetime {
    @JvmStatic
    fun main(args: Array<String>) {
        Scanner(System.`in`).use { sc ->
            val year: Int
            val month: Int
            val day: Int
            val hour: Int
            val minute: Int
            val second: Int
            val millisecond: Int
            val microsecond: Int
            val nanosecond: Int //initialize date and time variables
            val era1 =
                DateTimeFormatter.ofPattern("GGG") // Format the date and time values with a specified pattern for all supported formats
            val era2 = DateTimeFormatter.ofPattern("GGGG")
            val era3 = DateTimeFormatter.ofPattern("GGGGG")
            val year1 = DateTimeFormatter.ofPattern("uu")
            val year2 = DateTimeFormatter.ofPattern("uuuu")
            val yearEra = DateTimeFormatter.ofPattern("yy")
            val yearEra2 = DateTimeFormatter.ofPattern("yyyy")
            val dayOfYear = DateTimeFormatter.ofPattern("D")
            val monthOfYear = DateTimeFormatter.ofPattern("M")
            val monthOfYear2 = DateTimeFormatter.ofPattern("MMM")
            val monthOfYear3 = DateTimeFormatter.ofPattern("MMMM")
            val monthOfYear4 = DateTimeFormatter.ofPattern("MMMMM")
            val dayOfMonth = DateTimeFormatter.ofPattern("d")
            val quarter = DateTimeFormatter.ofPattern("q")
            val quarter2 = DateTimeFormatter.ofPattern("qqq")
            val quarter3 = DateTimeFormatter.ofPattern("qqqq")
            val weekBasedYear = DateTimeFormatter.ofPattern("YY")
            val weekBasedYear2 = DateTimeFormatter.ofPattern("YYYY")
            val weekOfYear = DateTimeFormatter.ofPattern("w")
            val weekOfMonth = DateTimeFormatter.ofPattern("W")
            val dayOfWeek = DateTimeFormatter.ofPattern("E")
            val dayOfWeek2 = DateTimeFormatter.ofPattern("EEEE")
            val dayOfWeek3 = DateTimeFormatter.ofPattern("EEEEE")
            val localDayOfWeek = DateTimeFormatter.ofPattern("e")
            val localDayOfWeek2 = DateTimeFormatter.ofPattern("eee")
            val localDayOfWeek3 = DateTimeFormatter.ofPattern("eeee")
            val localDayOfWeek4 = DateTimeFormatter.ofPattern("eeeee")
            val localWeekOfMonth = DateTimeFormatter.ofPattern("F")
            val amPm = DateTimeFormatter.ofPattern("a")
            val hour12 = DateTimeFormatter.ofPattern("h")
            val hour0To11 = DateTimeFormatter.ofPattern("K")
            val hour24 = DateTimeFormatter.ofPattern("k")
            val hourOfDay = DateTimeFormatter.ofPattern("H")
            val minute1 = DateTimeFormatter.ofPattern("m")
            val second1 = DateTimeFormatter.ofPattern("s")
            val fractionOfSecond = DateTimeFormatter.ofPattern("SSSSSSSSS")
            val millisecondOfDay = DateTimeFormatter.ofPattern("A")
            val nanosecondOfSecond = DateTimeFormatter.ofPattern("n")
            val nanosecondOfDay = DateTimeFormatter.ofPattern("N")
            val timezoneId = DateTimeFormatter.ofPattern("VV")
            val timezoneName = DateTimeFormatter.ofPattern("z")
            val timezoneName2 = DateTimeFormatter.ofPattern("zzzz")
            val timezoneOffset = DateTimeFormatter.ofPattern("OOOO")
            val timezoneOffsetZ = DateTimeFormatter.ofPattern("XXXXX")
            val timezoneOffsetX = DateTimeFormatter.ofPattern("xxxxx")
            val timezoneOffset2 = DateTimeFormatter.ofPattern("ZZZZZ")
            val timezoneOffsetZ1 = DateTimeFormatter.ofPattern("ZZZZ")

            try { //make sure date and time input is a valid integer
                print("Year: ")
                year = sc.nextInt()
                print("Month: ")
                month = sc.nextInt() // 1 is January
                print("Day: ")
                day = sc.nextInt()
                print("Hour: ")
                hour = sc.nextInt()
                print("Minute: ")
                minute = sc.nextInt()
                print("Second: ")
                second = sc.nextInt()
                print("Millisecond: ")
                millisecond = sc.nextInt()
                print("Microsecond: ")
                microsecond = sc.nextInt()
                print("Nanosecond: ")
                nanosecond = sc.nextInt()
                val enteredDateAndTime = LocalDateTime.of(year, month, day, hour, minute, second)
                    .withNano(millisecond * 1000000 + microsecond * 1000 + nanosecond) // Convert datetime of GregorianCalendar object to LocalDateTime object named enteredDateAndTime without a time zone and set nanoseconds to 1,000,000 (1 million) * milliseconds + 1,000 (1 thousand) * microseconds + nanoseconds
                val enteredDateAndTimeTimezone = ZonedDateTime.of(
                    enteredDateAndTime,
                    ZoneId.systemDefault()
                ) // Get time zone of entered date and time values
                // Print the entered date and time values in all supported formats
                println("\nEntered Date and Time Values:\n")
                println(
                    "Era: " + era1.format(enteredDateAndTime) + " (" + era2.format(enteredDateAndTime) + ")" + " (" + era3.format(
                        enteredDateAndTime
                    ) + ")"
                ) // Print the date and time values with formatted date and time pattern
                println("Year: " + year1.format(enteredDateAndTime) + " (" + year2.format(enteredDateAndTime) + ")")
                println("Era Year: " + yearEra.format(enteredDateAndTime) + " (" + yearEra2.format(enteredDateAndTime) + ")")
                println("Day of Year: " + dayOfYear.format(enteredDateAndTime))
                println(
                    "Month of Year: " + monthOfYear.format(enteredDateAndTime) + " (" + monthOfYear2.format(
                        enteredDateAndTime
                    ) + ")" + " (" + monthOfYear3.format(enteredDateAndTime) + ")" + " (" + monthOfYear4.format(
                        enteredDateAndTime
                    ) + ")"
                )
                println("Day of Month: " + dayOfMonth.format(enteredDateAndTime))
                println(
                    "Quarter: " + quarter.format(enteredDateAndTime) + " (" + quarter2.format(enteredDateAndTime) + ")" + " (" + quarter3.format(
                        enteredDateAndTime
                    ) + ")"
                )
                println(
                    "ISO Week-based Year: " + weekBasedYear.format(enteredDateAndTime) + " (" + weekBasedYear2.format(
                        enteredDateAndTime
                    ) + ")"
                )
                println("Week of Year: " + weekOfYear.format(enteredDateAndTime))
                println("Week of Month: " + weekOfMonth.format(enteredDateAndTime))
                println(
                    "Day of Week: " + dayOfWeek.format(enteredDateAndTime) + " (" + dayOfWeek2.format(
                        enteredDateAndTime
                    ) + ")" + " (" + dayOfWeek3.format(enteredDateAndTime) + ")"
                )
                println(
                    "Local Day of Week: " + localDayOfWeek.format(enteredDateAndTime) + " (" + localDayOfWeek2.format(
                        enteredDateAndTime
                    ) + ")" + " (" + localDayOfWeek3.format(enteredDateAndTime) + ")" + " (" + localDayOfWeek4.format(
                        enteredDateAndTime
                    ) + ")"
                )
                println("Local Week of Month: " + localWeekOfMonth.format(enteredDateAndTime))
                println("AM/PM: " + amPm.format(enteredDateAndTime))
                println("12 Hour Format " + hour12.format(enteredDateAndTime))
                println("0-11 Hour Format: " + hour0To11.format(enteredDateAndTime))
                println("24 Hour Format: " + hour24.format(enteredDateAndTime))
                println("Hour of Day: " + hourOfDay.format(enteredDateAndTime))
                println("Minute: " + minute1.format(enteredDateAndTime))
                println("Second: " + second1.format(enteredDateAndTime))
                println("Fraction of Second: " + fractionOfSecond.format(enteredDateAndTime))
                println("Millisecond of Day: " + millisecondOfDay.format(enteredDateAndTime))
                println("Nanosecond: " + nanosecondOfSecond.format(enteredDateAndTime))
                println("Nanosecond of Day: " + nanosecondOfDay.format(enteredDateAndTime))
                println("Time Zone ID: " + timezoneId.format(enteredDateAndTimeTimezone))
                println(
                    "Time Zone: " + timezoneName2.format(enteredDateAndTimeTimezone) + " (" + timezoneName.format(
                        enteredDateAndTimeTimezone
                    ) + ")"
                )
                println(
                    "Localized Time Zone Offset: " + timezoneOffset.format(enteredDateAndTimeTimezone) + " (" + timezoneOffset2.format(
                        enteredDateAndTimeTimezone
                    ) + ")"
                )
                println(
                    "Time Zone Offset: " + timezoneOffsetZ.format(enteredDateAndTimeTimezone) + " (" + timezoneOffsetX.format(
                        enteredDateAndTimeTimezone
                    ) + ")" + " (" + timezoneOffsetZ1.format(enteredDateAndTimeTimezone) + ")"
                )
                println("\nCurrent Date and Time Values:\n")
            } catch (ex: InputMismatchException) { //if entered, date and time values are in the wrong format (not a valid integer)
                println("\nInvalid date and time input.\nPrinting current date and time.\n") //print the error
            }

            // Print the current date and time values in all supported formats
            val dateAndTimeNow =
                ZonedDateTime.now() // Get the current date and time based on local computer date and time with local time zone
            println(
                "Current Era: " + era1.format(dateAndTimeNow) + " (" + era2.format(dateAndTimeNow) + ")" + " (" + era3.format(
                    dateAndTimeNow
                ) + ")"
            ) // Print the formatted date and time values in current local date and time
            println("Current Year: " + year1.format(dateAndTimeNow) + " (" + year2.format(dateAndTimeNow) + ")")
            println("Current Era Year: " + yearEra.format(dateAndTimeNow) + " (" + yearEra2.format(dateAndTimeNow) + ")")
            println("Current Day of Year: " + dayOfYear.format(dateAndTimeNow))
            println(
                "Current Month of Year: " + monthOfYear.format(dateAndTimeNow) + " (" + monthOfYear2.format(
                    dateAndTimeNow
                ) + ")" + " (" + monthOfYear3.format(dateAndTimeNow) + ")" + " (" + monthOfYear4.format(dateAndTimeNow) + ")"
            )
            println("Current Day of Month: " + dayOfMonth.format(dateAndTimeNow))
            println(
                "Current Quarter: " + quarter.format(dateAndTimeNow) + " (" + quarter2.format(dateAndTimeNow) + ")" + " (" + quarter3.format(
                    dateAndTimeNow
                ) + ")"
            )
            println(
                "Current ISO Week-based Year: " + weekBasedYear.format(dateAndTimeNow) + " (" + weekBasedYear2.format(
                    dateAndTimeNow
                ) + ")"
            )
            println("Current Week of Year: " + weekOfYear.format(dateAndTimeNow))
            println("Current Week of Month: " + weekOfMonth.format(dateAndTimeNow))
            println(
                "Current Day of Week: " + dayOfWeek.format(dateAndTimeNow) + " (" + dayOfWeek2.format(dateAndTimeNow) + ")" + " (" + dayOfWeek3.format(
                    dateAndTimeNow
                ) + ")"
            )
            println(
                "Current Local Day of Week: " + localDayOfWeek.format(dateAndTimeNow) + " (" + localDayOfWeek2.format(
                    dateAndTimeNow
                ) + ")" + " (" + localDayOfWeek3.format(dateAndTimeNow) + ")" + " (" + localDayOfWeek4.format(
                    dateAndTimeNow
                ) + ")"
            )
            println("Current Local Week of Month: " + localWeekOfMonth.format(dateAndTimeNow))
            println("Current AM/PM: " + amPm.format(dateAndTimeNow))
            println("Current 12 Hour Format " + hour12.format(dateAndTimeNow))
            println("Current 0-11 Hour Format: " + hour0To11.format(dateAndTimeNow))
            println("Current 24 Hour Format: " + hour24.format(dateAndTimeNow))
            println("Current Hour of Day: " + hourOfDay.format(dateAndTimeNow))
            println("Current Minute: " + minute1.format(dateAndTimeNow))
            println("Current Second: " + second1.format(dateAndTimeNow))
            println("Current Fraction of Second: " + fractionOfSecond.format(dateAndTimeNow))
            println("Current Millisecond of Day: " + millisecondOfDay.format(dateAndTimeNow))
            println("Current Nanosecond: " + nanosecondOfSecond.format(dateAndTimeNow))
            println("Current Nanosecond of Day: " + nanosecondOfDay.format(dateAndTimeNow))
            println("Current Time Zone ID: " + timezoneId.format(dateAndTimeNow))
            println(
                "Current Time Zone: " + timezoneName2.format(dateAndTimeNow) + " (" + timezoneName.format(
                    dateAndTimeNow
                ) + ")"
            )
            println(
                "Current Localized Time Zone Offset: " + timezoneOffset.format(dateAndTimeNow) + " (" + timezoneOffset2.format(
                    dateAndTimeNow
                ) + ")"
            )
            println(
                "Current Time Zone Offset: " + timezoneOffsetZ.format(dateAndTimeNow) + " (" + timezoneOffsetX.format(
                    dateAndTimeNow
                ) + ")" + " (" + timezoneOffsetZ1.format(dateAndTimeNow) + ")"
            )
            val currentUtcDateAndTime = Instant.now() // Get the current UTC date and time using an Instant object
            val utcDateAndTimeNow = LocalDateTime.ofInstant(
                currentUtcDateAndTime,
                ZoneOffset.UTC
            ) // Convert from an Instant object to LocalDateTime object
            println(
                "Current UTC Era: " + era1.format(utcDateAndTimeNow) + " (" + era2.format(utcDateAndTimeNow) + ")" + " (" + era3.format(
                    utcDateAndTimeNow
                ) + ")"
            ) // Print the formatted date and time values in current local date and time
            println("Current UTC Year: " + year1.format(utcDateAndTimeNow) + " (" + year2.format(utcDateAndTimeNow) + ")")
            println(
                "Current UTC Era Year: " + yearEra.format(utcDateAndTimeNow) + " (" + yearEra2.format(
                    utcDateAndTimeNow
                ) + ")"
            )
            println("Current UTC Day of Year: " + dayOfYear.format(utcDateAndTimeNow))
            println(
                "Current UTC Month of Year: " + monthOfYear.format(utcDateAndTimeNow) + " (" + monthOfYear2.format(
                    utcDateAndTimeNow
                ) + ")" + " (" + monthOfYear3.format(utcDateAndTimeNow) + ")" + " (" + monthOfYear4.format(
                    utcDateAndTimeNow
                ) + ")"
            )
            println("Current UTC Day of Month: " + dayOfMonth.format(utcDateAndTimeNow))
            println(
                "Current UTC Quarter: " + quarter.format(utcDateAndTimeNow) + " (" + quarter2.format(
                    utcDateAndTimeNow
                ) + ")" + " (" + quarter3.format(utcDateAndTimeNow) + ")"
            )
            println(
                "Current UTC ISO Week-based Year: " + weekBasedYear.format(utcDateAndTimeNow) + " (" + weekBasedYear2.format(
                    utcDateAndTimeNow
                ) + ")"
            )
            println("Current UTC Week of Year: " + weekOfYear.format(utcDateAndTimeNow))
            println("Current UTC Week of Month: " + weekOfMonth.format(utcDateAndTimeNow))
            println(
                "Current UTC Day of Week: " + dayOfWeek.format(utcDateAndTimeNow) + " (" + dayOfWeek2.format(
                    utcDateAndTimeNow
                ) + ")" + " (" + dayOfWeek3.format(utcDateAndTimeNow) + ")"
            )
            println(
                "Current UTC Local Day of Week: " + localDayOfWeek.format(utcDateAndTimeNow) + " (" + localDayOfWeek2.format(
                    utcDateAndTimeNow
                ) + ")" + " (" + localDayOfWeek3.format(utcDateAndTimeNow) + ")" + " (" + localDayOfWeek4.format(
                    utcDateAndTimeNow
                ) + ")"
            )
            println("Current UTC Local Week of Month: " + localWeekOfMonth.format(utcDateAndTimeNow))
            println("Current UTC AM/PM: " + amPm.format(utcDateAndTimeNow))
            println("Current UTC 12 Hour Format " + hour12.format(utcDateAndTimeNow))
            println("Current UTC 0-11 Hour Format: " + hour0To11.format(utcDateAndTimeNow))
            println("Current UTC 24 Hour Format: " + hour24.format(utcDateAndTimeNow))
            println("Current UTC Hour of Day: " + hourOfDay.format(utcDateAndTimeNow))
            println("Current UTC Minute: " + minute1.format(utcDateAndTimeNow))
            println("Current UTC Second: " + second1.format(utcDateAndTimeNow))
            println("Current UTC Fraction of Second: " + fractionOfSecond.format(utcDateAndTimeNow))
            println("Current UTC Millisecond of Day: " + millisecondOfDay.format(utcDateAndTimeNow))
            println("Current UTC Nanosecond: " + nanosecondOfSecond.format(utcDateAndTimeNow))
            println("Current UTC Nanosecond of Day: " + nanosecondOfDay.format(utcDateAndTimeNow))
        }
    }
}