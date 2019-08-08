package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Height in inches = " );
        int i = input.nextInt();
        if (i>=12){
            int j = i/12;
            int y= i%12;
            System.out.println( j + " " + y);
        }

    }
}
