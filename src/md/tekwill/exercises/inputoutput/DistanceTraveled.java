package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle (in miles per hour) :");
        int speed = input.nextInt();
        System.out.println("Enter time traveled (in hours):");
        int time = input.nextInt();
        int o = 1;
        System.out.println("Hour   |   Distance traveled");
        for (;o<=time;o++){
            int distance = o*speed;
            System.out.println(o+"        "+distance);
        }

    }
}
