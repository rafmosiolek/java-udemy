package com.raf;

public class Main {

    public static void main(String[] args) {

        // tests
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(728);
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(1023);
        printMegaBytesAndKiloBytes(10049);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int kb = kiloBytes - (mb * 1024);
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
