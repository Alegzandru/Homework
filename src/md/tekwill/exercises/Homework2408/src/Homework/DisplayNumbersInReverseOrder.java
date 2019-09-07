package Homework;

import java.util.Scanner;

public class DisplayNumbersInReverseOrder {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter biggest number from the pattern:");
        int n = input.nextInt();
        DisplayNumbersInReverseOrder methodCaller = new DisplayNumbersInReverseOrder();
        methodCaller.displayPattern(n);

    }


    public void displayPattern (int n){
        for (int i=1; i <= n ; i++ ){
            for (int c = n-i;c!=0;--c){
                System.out.print("  ");
            }
            for (int t = 1;t<=i;t++){
                System.out.print(" "+t);
            }
            System.out.println(" ");
        }

    }
}
