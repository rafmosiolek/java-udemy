package com.raf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter < 6) {

            System.out.println("Enter number \u0023" + counter + ": ");

            boolean hasNextInt = userInput.hasNextInt();

            if (hasNextInt) {
                counter++;
                sum += userInput.nextInt();
                userInput.nextLine();
            } else {
                System.out.println("Invalid input, please try again");
                userInput.nextLine();
            }
        }

        System.out.println("The sum of your chosen numbers is: " + sum);
        userInput.close();
    }
}
