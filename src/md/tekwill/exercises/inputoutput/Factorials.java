package md.tekwill.exercises.inputoutput;

public class Factorials {
    public static void main(String[] args) {
        long i = 1;
        long n = 20;
        long z=1;
        while (i<=n){
            z = i*(i+1)*z;
            System.out.println(z);
            i=i+2;
        }
        }
    }