package Collections.DateTimeAPI;

import java.time.LocalDate;

public class Q1DateTime {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);

        System.out.println("Today's Date : " + today);
        System.out.println("Date After 10 Days : " + afterTenDays);
    }
}