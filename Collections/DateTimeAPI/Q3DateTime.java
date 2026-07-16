package Collections.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Q3DateTime {

    public static void main(String[] args) {

        // Change this to your joining date
        LocalDate joiningDate = LocalDate.of(2023, 7, 1);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience in Wipro:");
        System.out.println(experience.getYears() + " Years "
                + experience.getMonths() + " Months "
                + experience.getDays() + " Days");
    }
}