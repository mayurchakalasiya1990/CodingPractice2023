package org.example.dateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextWedDays {

    public static void main(String[] args) {
        LocalDate nextWednesday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("Next Wednesday:"+nextWednesday);
    }
}
