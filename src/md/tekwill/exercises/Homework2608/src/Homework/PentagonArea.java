package Homework;

import java.util.Scanner;

public class PentagonArea {


    public static void main(String[] args) {
        PentagonArea pentagon = new PentagonArea();;
        System.out.println("The area of the pentagon is : "+pentagon.calculateArea());
    }


    public double calculateArea (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pentagon side length:");
        double side = input.nextDouble();
        double area = 5*side*side/(4*Math.tan(Math.PI/5));
        return area;
    }
}
