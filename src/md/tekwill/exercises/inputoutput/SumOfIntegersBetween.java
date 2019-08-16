package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class SumOfIntegersBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers (small number first, big number second)");
        int smallNumber = input.nextInt();
        int bigNumber = input.nextInt();
        int sum = 0;
        for (int s ; smallNumber>0&&bigNumber>0&&smallNumber<=bigNumber;++smallNumber){
            sum +=smallNumber;
        }
        System.out.println(sum);
        }
    }
