package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class SecondsToDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce number of seconds : ");
        long seconds = input.nextLong();
        final int seconds_to_minute = 60;
        final int seconds_to_hour = 3600;
        final long seconds_to_days = 86400;
        long days = seconds/seconds_to_days;
        long hours = (seconds-days*seconds_to_days)/seconds_to_hour;
        long minutes = (seconds-days*seconds_to_days-hours*seconds_to_hour)/seconds_to_minute;
        long seconds_remained = seconds - (days*seconds_to_days + hours*seconds_to_hour +minutes*seconds_to_minute);
        System.out.println(seconds+" "+"seconds ="+" "+days+" "+"days"+" "+hours+" "+"hours"+" "+minutes+" "+"minutes"+" "+seconds_remained+" "+ "seconds");

    }
}
