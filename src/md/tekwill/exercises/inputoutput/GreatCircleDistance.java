package md.tekwill.exercises.inputoutput;

import java.util.Scanner;
import java.lang.Math;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        final double radius = 6371.01;
        double d = radius*Math.acos(Math.sin(Math.toRadians(x1)))*Math.sin(Math.toRadians(x2))+(Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));
        System.out.print("Te distance between the points is "+d);
        System.out.print(" km");
    }
}
