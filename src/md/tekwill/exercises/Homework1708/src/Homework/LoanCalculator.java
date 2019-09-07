package Homework;
import java.lang.Math;
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the loan ammount :");
        double loan = input.nextDouble();
        System.out.println("Enter loan paying period in years :");
        double time = input.nextDouble();
        System.out.println("Interest rate    Monthly payment     Total payment");
        for (double interestRate=5; interestRate<=8; interestRate+=0.125){
            double interestRatePerMonth = interestRate/12;
            double numberOfMonths = time*12;
            double monthlyPayment = interestRatePerMonth*loan/(1-1/(Math.pow((1+interestRatePerMonth),numberOfMonths)));
            double totalLoan = loan+numberOfMonths*monthlyPayment;
            System.out.println(interestRate+"       "+monthlyPayment+"        "+totalLoan);
        }
    }
}
