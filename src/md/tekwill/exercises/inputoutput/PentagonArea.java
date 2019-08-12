package md.tekwill.exercises.inputoutput;

import java.util.Scanner;
import java.lang.Math;

public class PentagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center of a pentagon to a vertex : ");
        double r = input.nextFloat();
        double s = 2*r*Math.sin(Math.PI/5);
        double Area = (5*s*s)/(4*Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagon is "+"%.2f",Area);
    }
}
