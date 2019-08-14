package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit from 1 to 10");
        int i = input.nextInt();
        switch(i){
            case 1:
                System.out.println("The roman version of your digit is I");
                break;
            case 2:
                System.out.println("The roman version of your digit is II");
                break;
            case 3:
                System.out.println("The roman version of your digit is III");
                break;
            case 4:
                System.out.println("The roman version of your digit is IV");
                break;
            case 5:
                System.out.println("The roman version of your digit is V");
                break;
            case 6:
                System.out.println("The roman version of your digit is VI");
                break;
            case 7:
                System.out.println("The roman version of your digit is VII");
                break;
            case 8:
                System.out.println("The roman version of your digit is VIII");
                break;
            case 9:
                System.out.println("The roman version of your digit is IX");
                break;
            case 10:
                System.out.println("The roman version of your digit is X");
                break;
                default:
                    System.out.println("Invalid input");
        }
    }
}
