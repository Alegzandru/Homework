package Homework;

import java.util.Random;

public class CoinToss {


    static private  int numberOfHeads;
    static private  int numberOfTails;

    public static void main(String[] args) {
        CoinToss coinToss = new CoinToss();
        coinToss.flipACoin(100000000);
        System.out.println("The number of heads equals "+ coinToss.getNumberOfHeads());
        System.out.println("The number of tails equals "+ coinToss.getNumberOfTails());

    }

    public  int getNumberOfHeads() {
        return numberOfHeads;
    }

    public void setNumberOfHeads(int numberOfHeads) {
        CoinToss.numberOfHeads = numberOfHeads;
    }

    public int getNumberOfTails() {
        return numberOfTails;
    }

    public void setNumberOfTails(int numberOfTails) {
        CoinToss.numberOfTails = numberOfTails;
    }

    public void flipACoin(int times){
        numberOfHeads = 0;
        numberOfTails = 0;
        for (int n = 1;n<=times;n++ ){
            Random rand = new Random();
            int headsOrTails = rand.nextInt(2);
            if (headsOrTails==0)
                numberOfHeads++;
            else
                numberOfTails++;


        }

    }
}
