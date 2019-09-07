package Homework;

import java.util.Random;
import java.util.Scanner;

public class GuessTheColour {


    public static void main(String[] args) {
        System.out.println("The computer chooses one of the following colours: red, green, blue, orange, yellow. Try to guess the computer's choice!");
GuessTheColour guess = new GuessTheColour();
        System.out.println("You have guessed the result "+guess.compareNumberAndColour(2)+" times");
    }


    public int generateNumber(){
        Random rand = new Random();
        int n = rand.nextInt(5)+1;
        return n;
    }


    public int humanMadeAChoice (){
        int i = 0;
        Scanner input = new Scanner(System.in);
        String colourName = input.nextLine();
        if (colourName.toLowerCase().equals("red"))
            i = 1;
        if (colourName.toLowerCase().equals("green"))
            i = 2;
        if (colourName.toLowerCase().equals("blue"))
            i = 3;
        if (colourName.toLowerCase().equals("orange"))
            i = 4;
        if (colourName.toLowerCase().equals("yellow"))
            i = 5;
        if (i==0)
            humanMadeAChoice();
        return i;
    }


    public int compareNumberAndColour(int times){
        int t = 0;
        for (int z =1; z<=times; z++){
            System.out.println("Choose one colour: ");
            if (humanMadeAChoice()==generateNumber())
                t++;
        }
        return t;

    }
}
