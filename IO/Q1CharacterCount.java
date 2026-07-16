package OOPS.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1CharacterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        int count = 0;

        try {
            Scanner fileScanner = new Scanner(new File(fileName));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        count++;
                    }
                }
            }

            fileScanner.close();

            System.out.println("File '" + fileName + "' has " + count +
                    " instances of letter '" + ch + "'.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        sc.close();
    }
}