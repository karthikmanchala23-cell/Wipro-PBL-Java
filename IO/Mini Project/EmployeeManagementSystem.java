package iostream.MiniProject;

import java.io.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    try {
                        FileWriter fw = new FileWriter("employees.txt", true);

                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Employee Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();

                        fw.write(id + " " + name + " " + age + " " + salary + "\n");
                        fw.close();

                        System.out.println("Employee Added Successfully!");

                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        File file = new File("employees.txt");

                        if (!file.exists()) {
                            System.out.println("No Employee Records Found!");
                            break;
                        }

                        BufferedReader br = new BufferedReader(new FileReader(file));

                        String line;
                        System.out.println("\n-Report-");

                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }

                        System.out.println("-End of Report-");
                        br.close();

                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}