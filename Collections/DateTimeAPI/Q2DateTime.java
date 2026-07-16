package Collections.DateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Q2DateTime {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate secondSunday = today.plusMonths(1)
                .withDayOfMonth(1)
                .with(TemporalAdjusters.dayOfWeekInMonth(2,
                        java.time.DayOfWeek.SUNDAY));

        System.out.println("Second Sunday of Next Month: " + secondSunday);
    }
}