var year = document.querySelector("#year");
var month = document.querySelector("#month");
var day = document.querySelector("#day");
var hour = document.querySelector("#hour");
var minute = document.querySelector("#minute");
var second = document.querySelector("#second");
function setCurrentDate() {
    var currentDate = new Date();
    var currentYear = currentDate.getFullYear();
    var currentMonth = currentDate.getMonth() + 1;
    var currentDay = currentDate.getDate();
    var currentHour = currentDate.getHours();
    var currentMinute = currentDate.getMinutes();
    var currentSecond = currentDate.getSeconds();
    year.value = currentYear;
    month.value = currentMonth;
    day.value = currentDay;
    hour.value = currentHour;
    minute.value = currentMinute;
    second.value = currentSecond;
}
function setCurrentUtcDate() {
    var currentDate = new Date();
    var currentUtcYear = currentDate.getUTCFullYear();
    var currentUtcMonth = currentDate.getUTCMonth() + 1;
    var currentUtcDay = currentDate.getUTCDate();
    var currentUtcHour = currentDate.getUTCHours();
    var currentUtcMinute = currentDate.getUTCMinutes();
    var currentUtcSecond = currentDate.getUTCSeconds();
    year.value = currentUtcYear;
    month.value = currentUtcMonth;
    day.value = currentUtcDay;
    hour.value = currentUtcHour;
    minute.value = currentUtcMinute;
    second.value = currentUtcSecond;
}