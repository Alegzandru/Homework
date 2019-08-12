package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal : ");
        double subtotal = input.nextDouble();
        System.out.println("Enter the gratuity rate : ");
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal*gratuityRate/100;
        double total = subtotal + gratuity;
        System.out.printf("Your gratuity is "+"%.1f",gratuity);
        System.out.printf("$ and your total is "+"%.1f",total);
        System.out.print("$");
    }
}
