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
    @GetMapping("/")
    public String dateTimeForm(Model model) {
        DateTime dateTime = new DateTime();
        model.addAttribute("enteredDateTime", dateTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
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
                dateTime.getMillisecond() * 1000000 + dateTime.getMicrosecond() * 1000 + dateTime.getNanosecond());
        model.addAttribute("currentDateTime", dateTimeValues);
        Instant currentUtcDateTime = Instant.now();
        LocalDateTime currentUtcDateTimeNow = LocalDateTime.ofInstant(currentUtcDateTime, ZoneId.of("UTC"));
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
        return "index";
    }

    @PostMapping("submit-form")
    public String formatDateTime(@ModelAttribute("enteredDateTime") DateTime dateTime, Model model) {
        model.addAttribute("enteredDateTime", dateTime);
        LocalDateTime enteredDateTime = LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDay(),
                dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond(),
                dateTime.getMillisecond() * 1000000 + dateTime.getMicrosecond() * 1000 + dateTime.getNanosecond());
        model.addAttribute("enteredDateTime", dateTime);
        model.addAttribute("dateTimeOutput", enteredDateTime);
        return "result";
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}