package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class NegativePositiveAndZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 random numbers :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;
        if (a > 0) {
            positiveNumbers++;
        } else if (a < 0) {
            negativeNumbers++;
        } else {
            zeroNumbers++;
        }
        if (b > 0) {
            positiveNumbers++;
        } else if (b < 0) {
            negativeNumbers++;
        } else {
            zeroNumbers++;
        }
        if (c > 0) {
            positiveNumbers++;
        } else if (c < 0) {
            negativeNumbers++;
        } else {
            zeroNumbers++;
        }
        if (d > 0) {
            positiveNumbers++;
        } else if (d < 0) {
            negativeNumbers++;
        } else {
            zeroNumbers++;
        }
        if (e > 0) {
            positiveNumbers++;
        } else if (e < 0) {
            negativeNumbers++;
        } else {
            zeroNumbers++;
        }
        System.out.println("Value of positive number = " + positiveNumbers);
        System.out.println("Value of negative numbers = " + negativeNumbers);
        System.out.println("Value of numbers that are 0 = " + zeroNumbers);
    }
}