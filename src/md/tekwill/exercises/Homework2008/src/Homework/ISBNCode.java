package Homework;

import java.util.Scanner;

public class ISBNCode {
    Scanner input = new Scanner(System.in);
    String codeOf12 = input.next();
    double result3;
    double result4;
    public static void main(String[] args) {
        System.out.println("Enter the 12 digit code :");
        ISBNCode code = new ISBNCode();
        System.out.println("Your full code is "+code.codeOf12+code.result4);

    }
    public double Result(){
        for (int n = codeOf12.length();n>0;n--){
            char result1;
            double result2;
            result1 = codeOf12.charAt(codeOf12.length()-1);
            result2 = (double)result1;
            if (n%2==0)
            result3 +=3*result2;
            else
                result3 +=result2;
            result4 = 10-(result3%10);
            if (result4==10)
                result4=0;


        }
        return result4;
    }
}
