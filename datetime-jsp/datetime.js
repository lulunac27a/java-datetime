var year = document.querySelector("#year");
var month = document.querySelector("#month");
var day = document.querySelector("#day");
var hour = document.querySelector("#hour");
var minute = document.querySelector("#minute");
var second = document.querySelector("#second");
var millisecond = document.querySelector("#millisecond");
var microsecond = document.querySelector("#microsecond");
var nanosecond = document.querySelector("#nanosecond");

function setCurrentDate() {
    var currentDate = new Date();
    var currentYear = currentDate.getFullYear();
    var currentMonth = currentDate.getMonth() + 1; //Add 1 to month because 0 is January in JavaScript and 1 in Java
    var currentDay = currentDate.getDate();
    var currentHour = currentDate.getHours();
    var currentMinute = currentDate.getMinutes();
    var currentSecond = currentDate.getSeconds();
    var currentMillisecond = currentDate.getMilliseconds();
    year.value = currentYear; //set the input values to current local date and time
    month.value = currentMonth;
    day.value = currentDay;
    hour.value = currentHour;
    minute.value = currentMinute;
    second.value = currentSecond;
    millisecond.value = currentMillisecond;
    microsecond.value = 0;
    nanosecond.value = 0;
}

function setCurrentUtcDate() {
    var currentDate = new Date();
    var currentUtcYear = currentDate.getUTCFullYear();
    var currentUtcMonth = currentDate.getUTCMonth() + 1;
    var currentUtcDay = currentDate.getUTCDate();
    var currentUtcHour = currentDate.getUTCHours();
    var currentUtcMinute = currentDate.getUTCMinutes();
    var currentUtcSecond = currentDate.getUTCSeconds();
    var currentUtcMillisecond = currentDate.getUTCMilliseconds();
    year.value = currentUtcYear; //set the input values to current UTC date and time
    month.value = currentUtcMonth;
    day.value = currentUtcDay;
    hour.value = currentUtcHour;
    minute.value = currentUtcMinute;
    second.value = currentUtcSecond;
    millisecond.value = currentUtcMillisecond;
    microsecond.value = 0;
    nanosecond.value = 0;
}

function getDaysInMonth() {
    day.max = new Date(year.value, month.value, 0).getDate();
    if (day.value > day.max) {
        day.value = day.max;
    }
}