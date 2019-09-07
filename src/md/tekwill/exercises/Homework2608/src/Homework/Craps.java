package Homework;

import java.sql.SQLOutput;
import java.util.Random;

public class Craps {


    public static void main(String[] args) {
        Craps craps = new Craps();
        craps.rollTheDice();

    }



    public void rollTheDice (){
        Random rand = new Random();
        int first = rand.nextInt(6)+1;
        int second = rand.nextInt(6)+1;
        int sum = first+second;
        System.out.println("You rolled "+sum);
        win(sum);
        lose(sum);
        again(sum);
    }



    public void winByEqualOrLoseBy7 (int ThisSum){
        Random rand = new Random();
        int first = rand.nextInt(6)+1;
        int second = rand.nextInt(6)+1;
        int sum = first+second;
        System.out.println("You rolled "+sum);
        if (sum==ThisSum)
            System.out.println("You win!");
        else if (sum==7)
            System.out.println("You lose!");
        else winByEqualOrLoseBy7(ThisSum);
    }




    public void win(int sum){
        if (sum==7||sum==11)
            System.out.println("You win!");
    }


    public void lose(int sum){
        if (sum==2||sum==3||sum==12)
            System.out.println("You lose!");

    }

    public void again(int ThisSum){
        if (ThisSum==4||ThisSum==5||ThisSum==6||ThisSum==10||ThisSum==8||ThisSum==9) {
            Random rand = new Random();
            int first = rand.nextInt(6) + 1;
            int second = rand.nextInt(6) + 1;
            int sum = first + second;
            System.out.println("You rolled "+sum);
            if (sum==ThisSum)
                System.out.println("You win!");
            else if (sum==7)
                System.out.println("You lose!");
            else winByEqualOrLoseBy7(ThisSum);
        }
    }
}
