package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class ABCDF {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a grade (letter) :");
        String letter =
                letter = input.next();
        int a =1;
        switch (letter.toUpperCase()){
            case "A":
                System.out.println("The numeric value for grade A is 4");
                break;
            case "B":
                System.out.println("The numeric value for grade B is 3");
                break;
            case "C":
                System.out.println("The numeric value for grade C is 2");
                break;
            case "D":
                System.out.println("The numeric value for grade D is 1");
                break;
            case "F":
                System.out.println("The numeric value for grade F is 0");
                break;
                default:
                    System.out.println("Invalid input");
        }
    }
}
