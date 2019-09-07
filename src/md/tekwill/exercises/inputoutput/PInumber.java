package md.tekwill.exercises.inputoutput;

public class PInumber {
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
    }
}
