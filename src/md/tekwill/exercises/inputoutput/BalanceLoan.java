package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class BalanceLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce loan value : ");
        double initial_Loan = input.nextDouble();
        System.out.println("Introduce interest rate :");
        double interest_rate = input.nextDouble();
        System.out.println("Introduce monthly payment :");
        double monthly_payment = input.nextDouble();
        double Loan1 = initial_Loan -monthly_payment+interest_rate/100/12*initial_Loan;
        double Loan2 = Loan1-monthly_payment+interest_rate/100/12*Loan1;
        double Loan3 = Loan2-monthly_payment+interest_rate/100/12*Loan2;
        System.out.printf("Balance remaining after first payment: "+"%.2f",Loan1);
        System.out.println(" ");
        System.out.printf("Balance remaining after second payment: "+"%.2f",Loan2);
        System.out.println(" ");
        System.out.printf("Balance remaining after third payment: "+"%.2f",Loan3);
    }
}
