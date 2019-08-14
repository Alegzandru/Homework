package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class FatCalories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the calories of your desired food :");
        double calories = input.nextInt();
        System.out.println("Enter the fat grams of your desired food :");
        double fatgrams = input.nextInt();
        double fatcalories = fatgrams*9;
        double percentageOfCaloriesFromFat = fatcalories/calories*100;
        System.out.printf("The percentage of calories that come from fat is "+"%.0f",percentageOfCaloriesFromFat);
        System.out.print(" %.");
        if (percentageOfCaloriesFromFat<=30){
            System.out.println(" ");
            System.out.println("Your food is low in fat");
        }
    }
}
