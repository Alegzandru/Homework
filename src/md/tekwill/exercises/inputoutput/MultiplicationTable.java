package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number :");
        int i = input.nextInt();
        int e = input.nextInt();
        int o = 1;
        for (int m; o<=e; o++){
            int n = i*o;
            System.out.println(i+"*"+o+"="+n);
        }
    }
}
