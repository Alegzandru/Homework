package Homework;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String[] args) {
        GuessTheNumber guess = new GuessTheNumber();
        guess.compareTheNumbers(guess.giveARandomNumber(),guess.guessTheNumber());

    }


    public int giveARandomNumber() {
        int n;
        Random rand = new Random();
        n = rand.nextInt(9) + 1;
        return n;
    }


    public int guessTheNumber(){
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        return s;
    }


    public void compareTheNumbers(int computerNumber , int userNumber){
        GuessTheNumber guess = new GuessTheNumber();
        do {
            if (userNumber>computerNumber)
                System.out.println("Too high, try again");
            if (userNumber<computerNumber)
                System.out.println("Too low, try again");
            if (userNumber==computerNumber)
                System.out.println("You won!");
        }while (guess.guessTheNumber()!=giveARandomNumber());

    }
}
