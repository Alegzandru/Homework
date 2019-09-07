package Homework;

public class SquareRoot {
    double sum;
    public static void main(String[] args) {
SquareRoot test = new SquareRoot();
        System.out.println(test.stepByStep(624));
    }
    public double stepByStep(double lastNumber){
        for (double n =1; n<=lastNumber; n++){
            sum+=1/(Math.sqrt(n)+Math.sqrt(n+1));
        }
        return sum;
    }
}
