package Homework;

public class Accuracy {
    double n;
    double m;
    public static void main(String[] args) {
        Accuracy acc = new Accuracy();

        System.out.println(acc.leftToRight(50000));
        System.out.println(acc.rightToLeft(50000));

    }
    public double leftToRight (double i) {
        for (i = 1; i<=50000; i++){
            n +=1/i;
        }
        return n;
    }
    public double rightToLeft (double i) {
        for (i = 50000; i>=1; --i){
            m+=1/i;
        }
        return m;
    }
}
