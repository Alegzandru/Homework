package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Tax_5_percent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount of money :");
        double money = input.nextDouble();
        double moneyWithTax = money/100*5+money;
        System.out.printf("With tax added = "+"%.2f",moneyWithTax);
    }
}
