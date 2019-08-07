package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        System.out.println("Height in inches = " );
        Scanner input= new Scanner(System.in);
        int i = input.nextInt();
        if (i>=12){
            int j = i/12;
            int y= i%12;
            System.out.println( j + " " + y);
        }

    }
}
