package Homework;

import java.util.Scanner;

public class VowelConsonant {
    int numberOfConsonants;
    int numberOfVowels;


    public static void main(String[] args) {
        System.out.println("Enter a sentence :");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        VowelConsonant vc = new VowelConsonant();
        vc.determineNumberOfConsandVowl(word);


    }


    public void determineNumberOfConsandVowl(String word) {
        for (int i = 1; i <= word.length(); i++) {
            Character n = word.charAt(i - 1);
            if (Character.isLetter(n)) {
                char m = Character.toLowerCase(n);
                if (m == 'a' || m == 'e' || m == 'u' || m == 'i' || m == 'o') {
                    numberOfVowels++;
                } else numberOfConsonants++;

            }}
            System.out.println("Your sentence has " + numberOfConsonants + " consonants and " + numberOfVowels + " vowels");


    }
}