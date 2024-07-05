package com.example.lulunac27a.datetimethymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lulunac27a.datetimethymeleaf.entity.DateTime;

import java.time.LocalDateTime;

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