package Homework;
import java.lang.Math;

public class PiCalculatorNew {
    double pi1;
    double pi2;
    public static void main(String[] args) {

    }
    public double calculate (double i){
        for (double n=1; n<=i; n+=2){
            pi1+=Math.pow(-1,(n+1));
            for (double m=1; m<=i; m+=2){
                pi2+=pi1;
            }
        }
        return pi2;
    }
}
