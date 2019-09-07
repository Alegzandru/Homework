package Homework;

import java.util.Scanner;

public class StoresBarChart {


    public static void main(String[] args) {
        StoresBarChart methodCaller = new StoresBarChart();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of stores:");
        int totalStores = input.nextInt();
        input.nextLine();
        methodCaller.repeatDependingOnStoreNumber(totalStores);
    }


    public void repeatDependingOnStoreNumber(int storeNumber){
        for (int l = 1; l<=storeNumber; l++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of sales for store "+l+":");
            int totalSales = input.nextInt();
            StoresBarChart methodCaller = new StoresBarChart();
            showAsteriscs(totalSales);
        }
    }



    public void showAsteriscs(int sales){
        for (int n = sales/100; n!=0; --n){
            System.out.print("*");
        }
        System.out.println(" ");
    }

}
