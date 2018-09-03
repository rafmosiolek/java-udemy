package com.raf;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - yearOfBirth;
            String outputMessage;

            if (age >= 0 && age <= 120) {
                outputMessage = "Your name is " + name + ", and you are " + age + " years old.";
            } else {
                outputMessage = "ERROR: Invalid year of birth";
            }

            System.out.println(outputMessage);
        } else {
            System.out.println("Unable to parse a year of birth");
        }

        scanner.close();
    }
}
