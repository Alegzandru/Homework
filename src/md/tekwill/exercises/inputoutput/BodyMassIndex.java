package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double to_Meters = 0.0254;
        final double to_kg = 2.2;
        System.out.println("Introduce height in" );
        System.out.println("Feet : ");
        int heightFeet = input.nextInt();
        System.out.println("Inches : ");
        int heighInches = input.nextInt();
        System.out.println("Introduce weight in pounds : ");
        int weightpounds = input.nextInt();
        double heightMeters = (heightFeet*12 + heighInches)*to_Meters;
        double weightKg = weightpounds/to_kg;
        double BMI = weightKg/(heightMeters*heightMeters);
        System.out.println(BMI);
    }
}
