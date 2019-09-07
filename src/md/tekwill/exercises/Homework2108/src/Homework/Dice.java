package Homework;
import java.util.Random;

public class Dice {
        public static void main(String[] args) {
            Random r = new Random();
            int firstDiceRolledResult = r.nextInt(6) + 1;
            int secondDiceRolledResult = r.nextInt(6 ) + 1;
            int sumOfRolledDices = firstDiceRolledResult + secondDiceRolledResult;
            if (sumOfRolledDices == 2 || sumOfRolledDices == 3 || sumOfRolledDices == 12){
                System.out.println("You lose");
            } else if (sumOfRolledDices == 7 || secondDiceRolledResult == 11){
                System.out.println("You win");
            }
        }
    }
