package Homework;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.compareTheCoices(game.computerMadeAChoice(),game.HumanMadeAChoice());

    }


    public int computerMadeAChoice(){
        Random rand = new Random();
        int n = rand.nextInt(3)+1;
        return n;
    }


    public int HumanMadeAChoice(){
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one of the following: Rock, Paper, or Scissors");
        String choice = input.nextLine();
        if (choice.toLowerCase().equals("rock"))
            n = 1;
        if (choice.toLowerCase().equals("paper"))
            n = 2;
        if (choice.toLowerCase().equals("scissors"))
            n = 3;
        return n;
    }

    public void compareTheCoices(int computer, int human){
        if (computer==human) {
            System.out.println("Nobody won");
            compareTheCoices(computerMadeAChoice(),HumanMadeAChoice());
        }
        if (computer==1&&human==2)
            System.out.println("Human won!");
        if (computer==1&&human==3)
            System.out.println("Computer won!");
        if (computer==2&&human==1)
            System.out.println("Computer won!");
        if (computer==2&&human==3)
            System.out.println("Human won!");
        if (computer==3&&human==1)
            System.out.println("Human won!");
        if (computer==3&&human==2)
            System.out.println("Computer won!");
        if (computer==0||human==0)
            System.out.println("Wrong input from Human");
    }
}
