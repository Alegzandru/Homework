package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class KmAndGasoline {
    final double litersPerKm(double gasoline, double distance_){
        return gasoline*100/distance_;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KmAndGasoline value = new KmAndGasoline();
        System.out.println("Number of km driven : ");
        double distance = input.nextDouble();
        System.out.println("Number of liters consumed : ");
        double gasoline_Quantity = input.nextDouble();
        System.out.printf("Your car uses "+ "%.2f", value.litersPerKm(gasoline_Quantity, distance) + gasoline_Quantity,distance);
        System.out.print("liters per 100 km");
    }
}
