package Homework;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        ReverseString.text();
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(ReverseString.reverse(word));

    }

    public static void text() {
        System.out.println("Enter a word to get the reversed :");
    }

    public static String reverse(String word) {
        String reversed = "";
        int m = 1;
        for (int n = word.length(); n > 0; n--) {
            reversed += word.charAt(word.length() - m) + "";
            m++;
        }
        return reversed;
    }
}
