package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Copied {

    public static final double TO_KILO = 0.453592;
    public static final double TO_METERS = 0.0254;

    public static void main(String[] args) {
        //Define some starting variables and Scanner object
        Scanner s = new Scanner(System.in);
        int heightFeet, heightInches, weight;

        //Get the user input for height and weight
        System.out.println("Enter your height...");
        System.out.print("Feet: ");
        heightFeet = s.nextInt();

        System.out.print("Inches: ");
        heightInches = s.nextInt();

        System.out.print("Weight (lbs): ");
        weight = s.nextInt();

        //Do calculations and conversions
        int inInches = (heightFeet * 12) + heightInches;
        double heightInMeters = inInches * TO_METERS;
        double weightInKilo = weight * TO_KILO;

        //Get BMI
        double bmi = weightInKilo / (heightInMeters * heightInMeters);

        System.out.printf("A %d foot by %d inch adult of %dlbs. has a BMI of %.2f.\n", heightFeet, heightInches, weight, bmi);

        s.close();
    }
}