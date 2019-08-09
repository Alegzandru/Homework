package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class SecondsToDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce number of seconds : ");
        long seconds = input.nextLong();
        final int secondsToMinute = 60;
        final int secondsToHour = 3600;
        final long secondsToDays = 86400;
        long days = seconds/secondsToDays;
        long hours = (seconds-days*secondsToDays)/secondsToHour;
        long minutes = (seconds-days*secondsToHour-hours*secondsToHour)/secondsToMinute;
        long seconds_remained = seconds - (days*secondsToDays + hours*secondsToHour +minutes*secondsToMinute);
        System.out.println(seconds+" "+"seconds ="+" "+days+" "+"days"+" "+hours+" "+"hours"+" "+minutes+" "+"minutes"+" "+seconds_remained+" "+ "seconds");

    }
}
