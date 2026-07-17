package Abstraction.ExceptionHandling;

import java.util.Scanner;

public class Q4 {

    public static void userRegistration(String userName, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter User Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Country: ");
            String country = sc.nextLine();

            userRegistration(name, country);

        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}