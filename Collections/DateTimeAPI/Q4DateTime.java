package Collections.DateTimeAPI;

import java.time.LocalDate;

public class Q4DateTime {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        if (today.isLeapYear()) {
            System.out.println(today.getYear() + " is a Leap Year");
        } else {
            System.out.println(today.getYear() + " is Not a Leap Year");
        }
    }
}