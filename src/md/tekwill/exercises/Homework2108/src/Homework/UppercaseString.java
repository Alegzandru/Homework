package Homework;

import java.util.Scanner;

public class UppercaseString {
Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a sentence ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        UppercaseString up = new UppercaseString();
        up.checkHowManyUppercase(word);

    }

    public void checkHowManyUppercase (String word){
        int numberOfUp = 0;

        for (int i = 1; i<=word.length();i++){
            Character n = word.charAt(i-1);
            UppercaseString up = new UppercaseString();
            if (Character.isUpperCase(n)){
                numberOfUp++;

            }
        }
        System.out.println("Your sentence has "+numberOfUp+" uppercase letters");
    }




}
