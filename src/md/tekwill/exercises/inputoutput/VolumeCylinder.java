package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        double radius = input.nextDouble();
        System.out.println("Enter the lenght of the cylinder : ");
        double lenght = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * lenght;
        System.out.printf("The area is " + "%.4f", area);
        System.out.println(" ");
        System.out.printf("The volume is " + "%.4f", volume);
    }
}