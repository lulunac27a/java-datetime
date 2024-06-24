let year = document.querySelector("#year"); //year input value
let month = document.querySelector("#month"); //month input value
let day = document.querySelector("#day"); //day input value
let hour = document.querySelector("#hour"); //hour input value
let minute = document.querySelector("#minute"); //minute input value
let second = document.querySelector("#second"); //second input value
let millisecond = document.querySelector("#millisecond"); //millisecond input value
let microsecond = document.querySelector("#microsecond"); //microsecond input value
let nanosecond = document.querySelector("#nanosecond"); //nanosecond input value

function setCurrentDate() {
  const currentDate = new Date(); //set current local date and time
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
  microsecond.value = 0; //JavaScript doesn't support Date object with microseconds or nanoseconds, so set them to 0
  nanosecond.value = 0;
}

function setCurrentUtcDate() {
  const currentDate = new Date(); //set current UTC date and time
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
  day.max = new Date(year.value, month.value, 0).getDate(); //calculate days in a month in specified month and year
  if (day.value > day.max) {
    //if day value is more than number of days in a month
    day.value = day.max; //set day value to number of days in a month
  }
}
