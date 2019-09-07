package md.tekwill.exercises.Homework1408;

public class DivisibleBy5And6 {
    public static void main(String[] args) {
        int numbers = 10;
        for (int i = 100; i<=1000; i++){
            if (i%5==0||i%6==0){
                System.out.print(i+" ");
                --numbers;
                if (numbers==0) {
                    numbers = 10;
                    System.out.println(" ");
                }
            }
        }
    }
}
