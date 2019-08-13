package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character : ");
        String symbol =
        symbol = input.next();
        int ascii = symbol.charAt(0);
        System.out.println("The value in ASCII code is " + ascii);
    }
}
