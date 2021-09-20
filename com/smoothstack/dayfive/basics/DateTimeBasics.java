package com.smoothstack.dayfive.basics;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeBasics {

    LocalDateTime birthday;

    public DateTimeBasics() {
        birthday = LocalDateTime.of(1984, 7, 1, 12, 45, 32, 12);
    }

    public void getBirthday() {
        int year = birthday.getYear();
        int month = birthday.getMonthValue();
        int day = birthday.getDayOfMonth();
        int seconds = birthday.getSecond();
        int nanoseconds = birthday.getNano();
        System.out.printf("%d, %d, %d, %d, %d\n", year, month, day, seconds, nanoseconds);
    }

    public LocalDateTime previousThurs() {
        TemporalAdjuster ta = TemporalAdjusters.previous(DayOfWeek.THURSDAY);
        return birthday.with(ta);
    }

    public void printMonthsDays(int year) {
        for (Month m : Month.values()) {
            YearMonth ym = YearMonth.of(year, m);
            System.out.println(m + ": " + ym.lengthOfMonth() + " days.");
        }
    }

    public void listAllMondays(int month) {
        Month m = Month.of(month);
        Year year = Year.now();
        LocalDate date = LocalDate.of(year.getValue(), m, 1);
        if (!(date.getDayOfWeek() == DayOfWeek.MONDAY)) {
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        while (date.getMonth().getValue() == month) {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
    }

    public void isFridayThe13th(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) {
            System.out.printf("%1$tB %1$td, %1$tY is Friday the 13th.%n", date);
        } else System.out.printf("%1$tB %1$td, %1$tY is on a %tA.%n", date);
    }

    public static void main(String[] args) {
        DateTimeBasics dtb = new DateTimeBasics();
        dtb.getBirthday();
        System.out.println(dtb.previousThurs());
        dtb.printMonthsDays(1933);
        dtb.listAllMondays(6);
        dtb.isFridayThe13th(2021, 8, 13);
    }
}
