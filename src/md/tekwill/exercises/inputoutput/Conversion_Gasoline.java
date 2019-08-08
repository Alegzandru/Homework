package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Conversion_Gasoline {
    final double liters_to_gallons(double liters) {
        return liters/3.875;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter liters per 100 km value :");
        double liters_per_100km=input.nextDouble();
        final double km100_to_miles = 62.14;
        Conversion_Gasoline liters = new Conversion_Gasoline();
        double result = km100_to_miles/liters.liters_to_gallons(liters_per_100km);
        System.out.printf("Your value in miles per gallon ="+"%.0f",result);

    }
}
