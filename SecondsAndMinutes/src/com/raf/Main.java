package com.raf;

public class Main {

    private static final String INVALID_INPUT_MESSAGE = "Invalid input";

    public static void main(String[] args) {

        System.out.println(getDurationString(70, 30));
        System.out.println(getDurationString(-13452, 0));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(3600, -10));
        System.out.println(getDurationString(124345));
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_INPUT_MESSAGE;
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        String hoursResult = hours + "h";
        String minutesResult = minutes + "m";
        String secondsResult = seconds + "s";


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
        return result;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_INPUT_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);

    }
}
