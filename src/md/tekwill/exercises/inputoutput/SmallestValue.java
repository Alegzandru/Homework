package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers you're about to write :");
        int number = input.nextInt();
        System.out.println("Enter a couple of integers :");
        int o = 1;
        for (;o<=number;o++){
            int value = input.nextInt();
            if (o==number){
                if(value<value*o){
                    System.out.println(value);
                }
            }
        }

    }
}
