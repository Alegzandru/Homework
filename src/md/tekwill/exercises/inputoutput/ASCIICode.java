package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class ASCIICode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 127");
        int asciiCode = input.nextInt();
        if (asciiCode<127 && asciiCode>=0){
            char charvalue = (char) asciiCode;
            System.out.println("The character for ASCII code " + asciiCode + " is " + charvalue);
        }
        else System.out.println("Invalid code");
    }
}