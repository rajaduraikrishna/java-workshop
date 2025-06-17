package com.myjava.practice.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        LocalDate newToday = LocalDate.now();
        System.out.println(newToday);
        LocalDate dateOfBirth = LocalDate.of(1990, Month.APRIL, 4);
        System.out.println(dateOfBirth);
        System.out.println(newToday.compareTo(dateOfBirth));
    }
}
