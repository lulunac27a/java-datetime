package com.example.lulunac27a.datetimethymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lulunac27a.datetimethymeleaf.entity.DateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Controller
public class DateTimeController {
    @GetMapping("/") // get request from home page
    public String dateTimeForm(Model model) {
        DateTime dateTime = new DateTime();// create the date and time object
        model.addAttribute("enteredDateTime", dateTime);
        LocalDateTime currentDateTime = LocalDateTime.now();// set the current date and time to now
        dateTime.setYear(currentDateTime.getYear());
        dateTime.setMonth(currentDateTime.getMonthValue());
        dateTime.setDay(currentDateTime.getDayOfMonth());
        dateTime.setHour(currentDateTime.getHour());
        dateTime.setMinute(currentDateTime.getMinute());
        dateTime.setSecond(currentDateTime.getSecond());
        dateTime.setMillisecond((currentDateTime.getNano() / 1000000) % 1000);
        dateTime.setMicrosecond((currentDateTime.getNano() / 1000) % 1000);
        dateTime.setNanosecond(currentDateTime.getNano() % 1000);
        LocalDateTime dateTimeValues = LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDay(),
                dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond(),
                dateTime.getMillisecond() * 1000000 + dateTime.getMicrosecond() * 1000 + dateTime.getNanosecond());// set
                                                                                                                   // date
                                                                                                                   // and
                                                                                                                   // time
                                                                                                                   // values
        model.addAttribute("currentDateTime", dateTimeValues);
        Instant currentUtcDateTime = Instant.now();
        LocalDateTime currentUtcDateTimeNow = LocalDateTime.ofInstant(currentUtcDateTime, ZoneId.of("UTC"));// set the
                                                                                                            // current
                                                                                                            // UTC date
                                                                                                            // and time
                                                                                                            // to now
        DateTime utcDateTimeValues = new DateTime();
        utcDateTimeValues.setYear(currentUtcDateTimeNow.getYear());
        utcDateTimeValues.setMonth(currentUtcDateTimeNow.getMonthValue());
        utcDateTimeValues.setDay(currentUtcDateTimeNow.getDayOfMonth());
        utcDateTimeValues.setHour(currentUtcDateTimeNow.getHour());
        utcDateTimeValues.setMinute(currentUtcDateTimeNow.getMinute());
        utcDateTimeValues.setSecond(currentUtcDateTimeNow.getSecond());
        utcDateTimeValues.setMillisecond((currentUtcDateTimeNow.getNano() / 1000000) % 1000);
        utcDateTimeValues.setMicrosecond((currentUtcDateTimeNow.getNano() / 1000) % 1000);
        utcDateTimeValues.setNanosecond(currentUtcDateTimeNow.getNano() % 1000);
        LocalDateTime utcDateTimeValuesNow = LocalDateTime.of(utcDateTimeValues.getYear(), utcDateTimeValues.getMonth(),
                utcDateTimeValues.getDay(), utcDateTimeValues.getHour(), utcDateTimeValues.getMinute(),
                utcDateTimeValues.getSecond(), utcDateTimeValues.getMillisecond() * 1000000
                        + utcDateTimeValues.getMicrosecond() * 1000 + utcDateTimeValues.getNanosecond());
        model.addAttribute("currentUtcDateTime", utcDateTimeValuesNow);
        return "index";// return index page
    }

    @PostMapping("submit-form") // POST request from submitting the form
    public String formatDateTime(@ModelAttribute("enteredDateTime") DateTime dateTime, Model model) {// format date and
                                                                                                     // time using date
                                                                                                     // and time format
                                                                                                     // patterns
        model.addAttribute("enteredDateTime", dateTime);
        LocalDateTime enteredDateTime = LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDay(),
                dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond(),
                dateTime.getMillisecond() * 1000000 + dateTime.getMicrosecond() * 1000 + dateTime.getNanosecond());// set
                                                                                                                   // entered
                                                                                                                   // date
                                                                                                                   // and
                                                                                                                   // time
                                                                                                                   // to
                                                                                                                   // form
                                                                                                                   // request
                                                                                                                   // values
        model.addAttribute("dateTimeOutput", enteredDateTime);// add entered date and time values needed to print
                                                              // formatted date and time values
        return "result";// return result page
    }

    @RequestMapping("/") // show index page when request is made from home page
    public String showHomePage() {// show home page
        return "index";// return index page
    }
}