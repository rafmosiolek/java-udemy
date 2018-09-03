package com.raf;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - yearOfBirth;

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

        scanner.close();
    }
}
