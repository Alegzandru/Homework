package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class InputToDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple numbers :");
        System.out.println("The program will end when you'll enter 0");
        int sum = 0;
        for (int m=2; m>=0;) {
            int s = input.nextInt();
            sum = +s;
            if (s != 0) {
                break;
            }

        }
        System.out.println(sum);
    }
}