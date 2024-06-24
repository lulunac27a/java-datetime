let year = document.querySelector("#year");
let month = document.querySelector("#month");
let day = document.querySelector("#day");
let hour = document.querySelector("#hour");
let minute = document.querySelector("#minute");
let second = document.querySelector("#second");
let millisecond = document.querySelector("#millisecond");
let microsecond = document.querySelector("#microsecond");
let nanosecond = document.querySelector("#nanosecond");

function setCurrentDate() {
    const currentDate = new Date();
    const currentYear = currentDate.getFullYear();
    const currentMonth = currentDate.getMonth() + 1; //Add 1 to month because 0 is January in JavaScript and 1 in Java
    const currentDay = currentDate.getDate();
    const currentHour = currentDate.getHours();
    const currentMinute = currentDate.getMinutes();
    const currentSecond = currentDate.getSeconds();
    const currentMillisecond = currentDate.getMilliseconds();
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
    const currentDate = new Date();
    const currentUtcYear = currentDate.getUTCFullYear();
    const currentUtcMonth = currentDate.getUTCMonth() + 1;
    const currentUtcDay = currentDate.getUTCDate();
    const currentUtcHour = currentDate.getUTCHours();
    const currentUtcMinute = currentDate.getUTCMinutes();
    const currentUtcSecond = currentDate.getUTCSeconds();
    const currentUtcMillisecond = currentDate.getUTCMilliseconds();
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
