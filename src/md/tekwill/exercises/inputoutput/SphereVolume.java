package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce radius lenght in meters :");
        double r = input.nextDouble();
        double volume = 4.0f / 3.0f * r * r * r;
        System.out.printf("%.4f", volume);
        System.out.print("π square meters");
    }
}