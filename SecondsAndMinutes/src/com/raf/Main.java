package com.raf;

public class Main {

    public static void main(String[] args) {

        getDurationString(129, 30);
        getDurationString(3645);

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid input");
            return "Invalid input";
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        String hoursResult = "" + hours + "h";
        String minutesResult = "" + minutes + "m";
        String secondsResult = "" + seconds + "s";


        if (hours < 10) {
            hoursResult = "0" + hours + "h";
        }
        if (minutes < 10) {
            minutesResult = "0" + minutes + "m";
        }
        if (seconds < 10) {
            secondsResult = "0" + seconds + "s";
        }

        String result = hoursResult + minutesResult + secondsResult;
        System.out.println(result);

        return result;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid input");
            return "Invalid input";
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);

    }
}
