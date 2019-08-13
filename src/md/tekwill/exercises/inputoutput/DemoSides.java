package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class DemoSides {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        System.out.println(side1);
    }
}
