package Homework;

import java.util.Random;

public class NByN {



    public static void main(String[] args) {
        NByN methodCaller = new NByN();
        methodCaller.printNbyN(8);
    }


    public void print1Or0(){
        Random rand = new Random();
        int n = rand.nextInt(2);
        System.out.print(n+" ");
    }



    public void printNbyN (int n){
        for (int i = 1; i<=n; i++){
            for (int j=1; j<= n; j++){
                print1Or0();
            }
            System.out.println(" ");
        }
    }
}
