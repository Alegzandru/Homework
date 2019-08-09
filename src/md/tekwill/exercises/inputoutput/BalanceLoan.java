package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class BalanceLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce loan value : ");
        double initialLoan = input.nextDouble();
        System.out.println("Introduce interest rate :");
        double interestRate = input.nextDouble();
        System.out.println("Introduce monthly payment :");
        double monthlypayment = input.nextDouble();
        double Loan1 = initialLoan -monthlypayment+interestRate/100/12*initialLoan;
        double Loan2 = Loan1-monthlypayment+interestRate/100/12*Loan1;
        double Loan3 = Loan2-monthlypayment+interestRate/100/12*Loan2;
        System.out.printf("Balance remaining after first payment: "+"%.2f",Loan1);
        System.out.println(" ");
        System.out.printf("Balance remaining after second payment: "+"%.2f",Loan2);
        System.out.println(" ");
        System.out.printf("Balance remaining after third payment: "+"%.2f",Loan3);
    }
}
