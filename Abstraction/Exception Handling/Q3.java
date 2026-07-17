package Abstraction.ExceptionHandling;

import java.util.Scanner;

public class Q3 {

    public static void validateMark(int mark)
            throws NegativeMarksException, OutOfRangeException {

        if (mark < 0) {
            throw new NegativeMarksException("Negative Marks are not allowed");
        }

        if (mark > 100) {
            throw new OutOfRangeException("Marks should be between 0 and 100");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[2];
        int[][] marks = new int[2][3];

        try {
            for (int i = 0; i < 2; i++) {

                System.out.println("Enter Student Name:");
                name[i] = sc.nextLine();

                int sum = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 0; j < 3; j++) {

                    marks[i][j] = Integer.parseInt(sc.nextLine());

                    validateMark(marks[i][j]);

                    sum += marks[i][j];
                }

                double avg = sum / 3.0;

                System.out.println("Average marks of " + name[i] + " = " + avg);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        }
        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}