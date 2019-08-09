package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class ConversionGasoline {
    final double litersToGallons(double liters) {
        return liters/3.875;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter liters per 100 km value :");
        double litersPer100km=input.nextDouble();
        final double km100toMiles = 62.14;
        ConversionGasoline liters = new ConversionGasoline();
        double result = km100toMiles/liters.litersToGallons(litersPer100km);
        System.out.printf("Your value in miles per gallon ="+"%.0f",result);

    }
}
