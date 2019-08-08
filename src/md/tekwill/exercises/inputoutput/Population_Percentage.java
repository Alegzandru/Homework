package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Population_Percentage{
    public double calculate_Percentage1 (double part1, double whole){
        return part1/whole*100;
        }
    public double calculate_Percentage2 (double part2, double whole) {
        return part2 / whole * 100;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Population_Percentage prc = new Population_Percentage();
        System.out.println("Introduce world population at the moment :");
        long whole = input.nextLong();
        System.out.println("Introduce population in the US at the moment");
        long part1 = input.nextLong();
        System.out.println("Introduce population in Moldova at the moment :");
        long part2 = input.nextInt();
        System.out.printf("The population of the US is "+"%.5f",prc.calculate_Percentage1(part1, whole));
        System.out.print("% of the world population");
        System.out.println(" ");
        System.out.printf("The population of Moldova is "+ "%.5f", prc.calculate_Percentage2(part2,whole));
        System.out.print("% of the world population");
    }
}
