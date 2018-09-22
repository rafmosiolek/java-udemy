package com.raf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstInput = true;

        while (true) {

            System.out.println("Enter the number:");
            boolean hasNextInt = userInput.hasNextInt();

            if (hasNextInt) {

               int currentInput = userInput.nextInt();

               if (firstInput) {
                   min = currentInput;
                   max = currentInput;
                   firstInput = false;
               }

               if (currentInput < min) {
                   min = currentInput;
               }

               if (currentInput > max) {
                   max = currentInput;
               }

            } else {
                System.out.println("Your min value is: " + min + " and max value is: " + max + ".");
                break;
            }
        }
        userInput.close();
    }
}