package Homework;

public class SumFractions {
    double sum;
    public static void main(String[] args) {
        SumFractions sumof = new SumFractions();
        System.out.println(sumof.calculatesum(97));
    }
    public double calculatesum (int n){
        for (double i=1; i<=n; i+=2){
            sum+=i/(i+2);
        }
        return sum;
    }
}
