package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes : ");
        int minutes = input.nextInt();
        int years = minutes/(60*24*365);
        int days = (minutes-(years*60*24*365))/(60*24);
        System.out.println(minutes+" minutes are approximately "+years+" years and "+days+" days");
    }
}
