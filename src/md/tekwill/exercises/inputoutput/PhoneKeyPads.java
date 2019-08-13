package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter from the phone's key pad :");
        char letter = input.next().toLowerCase().charAt(0);
        if (letter == 'a' || letter == 'b' || letter == 'c')
            System.out.println("The corresponding number is 2");
        if (letter == 'd' || letter == 'e' || letter == 'f')
            System.out.println("The corresponding number is 3");
        if (letter == 'g' || letter == 'h' || letter == 'i')
            System.out.println("The corresponding number is 4");
        if (letter == 'j' || letter == 'k' || letter == 'l')
            System.out.println("The corresponding number is 5");
        if (letter == 'm' || letter == 'n' || letter == 'o')
            System.out.println("The corresponding number is 6");
        if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's')
            System.out.println("The corresponding number is 7");
        if (letter == 't' || letter == 'u' || letter == 'v')
            System.out.println("The corresponding number is 8");
        if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z')
            System.out.println("The corresponding number is 9");
    }
}