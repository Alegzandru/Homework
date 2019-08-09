package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class DollarBills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce an amount of money");
        int money = input.nextInt();
        int dollars20 = money/20;
        int dollars10 = money%20/10;
        int dollars5 = money%10/5;
        int dollars1 = money%5;
        System.out.println("20$ bills : "+ dollars20);
        System.out.println("10$ bills : "+ dollars10);
        System.out.println("5$bills : "+ dollars5);
        System.out.println("1$bills : "+ dollars1);

    }
}
