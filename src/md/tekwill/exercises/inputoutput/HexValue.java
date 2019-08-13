package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class HexValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number between 0 and 15");
        Integer i = input.nextInt();
        if (i>=0 && i<16){
            System.out.println("The hex value is " + Integer.toHexString(i));
        }
        else System.out.println("Invalid input");
    }
}
