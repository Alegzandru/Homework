package md.tekwill.exercises.inputoutput;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 1;
        for (int a=1; a<=15; a+=2) {
           product *=a;
            System.out.println(product);
        }
    }
}
