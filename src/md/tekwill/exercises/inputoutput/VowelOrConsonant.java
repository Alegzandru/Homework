package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter from the alphabet :");
        String letter =
                letter = input.next();
        int number = letter.toUpperCase().charAt(0);
        if (number>=65&&number<=90){
            if (number==65||number==69||number==73||number==79||number==85||number==89){
                System.out.println("The introduced letter is a vowel");
            }
            else System.out.println("The introduced letter is a consonant");
        }
        else System.out.println("Invalid input");

    }
}
