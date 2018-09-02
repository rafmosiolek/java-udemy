package com.raf;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(593));
        System.out.println(getLargestPrime(-10));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int getLargestPrime(int num) {

        if (isPrime(num)) {
            return num;
        } else {
            if (num < 2) {
                return -1;
            } else {
                int i;
                for (i = 2; i <= num; i++) {
                    if (num % i == 0) {
                        num = num / i;
                        i--;
                    }
                }
                return i;
            }
        }
    }
}
