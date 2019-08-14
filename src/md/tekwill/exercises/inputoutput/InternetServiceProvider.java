package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your package (A, B or C) :");
        char pack = input.next().toUpperCase().charAt(0);
        System.out.println("Enter the number of hours that were used :");
        double hours = input.nextInt();
        if (pack == 'A') {
            double bill = 9.95;
            if (hours > 10) {
                double bill2 = 9.95 + (hours - 10) * 2.00;
                System.out.println("Your bill is " + bill2 + "$");
                if (bill2 > 13.95) {
                    double billsavedPackB = bill2 - (13.95 + (hours - 20) * 1.00);
                    System.out.println("You could've saved " + billsavedPackB + " $ with package B");
                }
                if (bill2 > 19.95) {
                    double billsavedPackC = bill2 - 19.95;
                    System.out.println("You could've saved " + billsavedPackC + " $ with package C");
                }}
            else System.out.println("Your bill is "+bill+"$");
            }
            if (pack == 'B') {
                double bill = 13.95;
                if (hours > 20) {
                    double bill2 = 13.95 + (hours - 20) * 1.00;
                    System.out.println("Your bill is " + bill2 + "$");
                if (bill2 > 19.95) {
                    double billsavedPackC = bill2 - 19.95;
                    System.out.println("You could've saved " + billsavedPackC + " $ with package C");
                }}
                else
                    System.out.println("Your bill is " + bill + "$");
            }

            if (pack == 'C') {
                double bill = 19.95;
                System.out.println("Your bill is " + bill + "$");
            }

        }
    }