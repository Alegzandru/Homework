package md.tekwill.exercises.inputoutput;

public class ArrayDemo {
    public static void main(String[] args) {
        double computedValue = 0.00;
        double piValue = 4.00;
        for (double i=1, j = 3; i<=200000; ++i, j+=2){
            if (i%2==1)
                computedValue-=4/j;
            else
                computedValue+=4/j;
        }
        piValue +=computedValue;
        System.out.println(piValue);
        ArrayDemo p = new ArrayDemo();
        System.out.println(p.computePi(20));
        System.out.println(p.computePi(200));
        System.out.println(p.computePi(2000));
        System.out.println(p.computePi(20000));
        System.out.println(p.computePi(200000));
    }
    public double computePi (int limit){
        double computedValue2 = 0.00;
        double piValue2 = 4.00;
        for (double i=1, j = 3; i<=limit; ++i, j+=2){
            if (i%2==1)
                computedValue2-=4/j;
            else
                computedValue2+=4/j;
        }
        return piValue2+computedValue2;
    }


}
