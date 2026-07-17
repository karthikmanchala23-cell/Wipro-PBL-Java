package Abstraction.ExceptionHandling;

public class Q5 {

    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18 || age >= 60) {
            throw new InvalidAgeException("Age should be >=18 and <60");
        }
    }

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                System.out.println("Please enter Name and Age as command line arguments.");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            validateAge(age);

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);

        } catch (NumberFormatException e) {
            System.out.println("Age should be a valid integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}