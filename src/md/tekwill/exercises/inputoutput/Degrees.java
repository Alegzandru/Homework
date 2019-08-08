package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Degrees {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce latitude in");
        System.out.println("Degrees : ");
        int Degrees = input.nextInt();
        System.out.println("Minutes : ");
        double Minutes = input.nextInt();
        System.out.println("Seconds");
        double Seconds = input.nextInt();
        final double minutes_to_degrees = 60;
        final double seconds_to_degrees = 3600;
        double Decimal_Value = Degrees + (Minutes/minutes_to_degrees) + (Seconds/seconds_to_degrees);
        System.out.printf("%.4f", Decimal_Value);

    }
}
