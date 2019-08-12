package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer number below 1000 : ");
        int number = input.nextInt();
        if (number<1000&&number>=0){
            int a = 0;
            int b = 0;
            int c = 0;
            a = number/100;
            b = (number-a*100)/10;
            c = (number-a*100-b*10)/1;
            int sum = a + b + c;
            System.out.println("The sum of digits = "+sum);
        }
        else System.out.println("Number is invalid");
    }
}
