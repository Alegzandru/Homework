package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a medium (air, water or steel):");
        String medium = input.next().toLowerCase();
        System.out.println("Enter a distance in feet :");
        double distance = input.nextDouble();
        if (medium.equals("air")){
            double Time = distance/1100;
            System.out.println("Your time in seconds is "+Time);
        }
        if (medium.equals("water")){
            double Time = distance/4900;
            System.out.println("Your time in seconds is "+Time);
        }
        if (medium.equals("steel")){
            double Time = distance/16400;
            System.out.println("Your time in seconds is "+Time);
        }
        else System.out.println("Invalid medium");
    }
    }
