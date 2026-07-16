package Collections.DateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q6DateTime {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current Date and Time :");
        System.out.println(now.format(format));
    }
}