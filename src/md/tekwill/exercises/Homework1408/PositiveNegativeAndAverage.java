package md.tekwill.exercises.Homework1408;

import java.util.Scanner;

public class PositiveNegativeAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a couple of integers, the program end if its 0 :");
        boolean working = true;
        float totalnumbers = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        float average = 0;
        float total = 0;
        for (;working;){
            int value = input.nextInt();
            if (value == 0)
                working = false;
            if (value!=0)
            totalnumbers ++;
            if (value>0)
                positiveNumbers++;
            if (value<0)
                negativeNumbers++;
            if (value!=0)
                total+=value;
            if (value!=0)
                average = total/totalnumbers;
        }
        System.out.println("The number of positives is "+ positiveNumbers);
        System.out.println("The number of negatives is "+ negativeNumbers);
        System.out.println("Total number of integers :" + totalnumbers);
        System.out.println("Average value equals "+average);
    }
}
