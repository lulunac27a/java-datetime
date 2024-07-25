package com.example.lulunac27a.datetimethymeleaf.entity;

public class DateTime {//class with date and time information with milliseconds, microseconds and nanoseconds
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private int millisecond;
    private int microsecond;
    private int nanosecond;
    //get getter and setter values for all fields
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getMillisecond() {
        return millisecond;
    }
    public void setMillisecond(int millisecond) {
        this.millisecond = millisecond;
    }
    public int getMicrosecond() {
        return microsecond;
    }
    public void setMicrosecond(int microsecond) {
        this.microsecond = microsecond;
    }
    public int getNanosecond() {
        return nanosecond;
    }
    public void setNanosecond(int nanosecond) {
        this.nanosecond = nanosecond;
    }
    
}