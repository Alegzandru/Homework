package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class BarsAsterisks {
    public static void main(String[] args) {
        BarsAsterisks asterisksgenerator = new BarsAsterisks();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers between 1 and 30 :");
        int number[]=new int[5];
        for (int i =0; i<5;i++){
            number[i] = input.nextInt();
        }
        input.close();
asterisksgenerator.asterisksgenerator(number);
        }
        public void asterisksgenerator (int number[]){
            for(int i = 0; i <  number.length; i++)
            {
                for(int j=1;j<=number[i];j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

    }


    }
