package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class conversionGasoline {
    final double litersToGallons(double liters) {
        return liters/3.875;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter liters per 100 km value :");
        double liters_per_100km=input.nextDouble();
        final double km100_to_miles = 62.14;
        conversionGasoline liters = new conversionGasoline();
        double result = km100_to_miles/liters.litersToGallons(liters_per_100km);
        System.out.printf("Your value in miles per gallon ="+"%.0f",result);

    }
}
