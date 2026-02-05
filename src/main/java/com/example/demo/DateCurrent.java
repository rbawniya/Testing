package com.example.demo;

import java.time.LocalDate;

public class DateCurrent {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // Current Date

        System.out.println(localDate.minusDays(1)); // Previous Day

        System.out.println(localDate.plusDays(1)); // Next Date
    }
}
