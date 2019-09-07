package Homework;

import java.util.Random;

public class DiceComputerMan {


    public static void main(String[] args) {
        DiceComputerMan dice = new DiceComputerMan();
        dice.calculateWinner(20);

    }


    public void showWinner(String winner, String loser, int winnerScore, int loserScore) {
        System.out.println(winner + " has a score of: " + winnerScore + ", " + loser + " has a score of: " + loserScore);
        System.out.println(winner + " wins");

    }


    public void calculateWinner(int times) {
        int computer;
        int human;
        int n1 = 0;
        int n2 = 0;
        for (int i = 1; i <= times; i++) {
            Random dice = new Random();
            DiceComputerMan methodcaller = new DiceComputerMan();
            computer = dice.nextInt(6) + 1;
            human = dice.nextInt(6) + 1;
            if (computer > human) {
                n1++;
                methodcaller.showWinner("Computer", "Human", computer, human);
                if (n1==1)
                    System.out.println(i+"."+"Computer has won 1 time");
                else
                System.out.println(i+"."+"Computer has won " + n1 + " times");
            }
            if (human > computer) {
                n2++;
                methodcaller.showWinner("Human", "Computer", human, computer);
                if (n2==1)
                    System.out.println(i+"."+"Human was won 1 time");
                else
                System.out.println(i+"."+"Human has won " + n2 + " times");
            }
            if (human == computer)
                System.out.println(i+"."+"Computer has the same score as Human");

        }
        if (n1 > n2)
            System.out.println("Computer is the grand winner");
        if (n2 > n1)
            System.out.println("Human is the grand winner");
        if (n2 == n1)
            System.out.println("Nobody won");
    }
}
