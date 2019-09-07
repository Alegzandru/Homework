package md.tekwill.exercises.Homework1408;

public class MilesToKmAndBack {
    public static void main(String[] args) {
        System.out.println("Miles     Km    |    Km       Miles");
        int valueinMiles1 = 1;
        double valueinKm1 = 1;
        int valueinKm2 = 20;
        double valueinMiles2 =1;
        for (int i = 1; i <= 10; ++i) {
            valueinKm1 = valueinMiles1 * 1.609;
            System.out.printf(valueinMiles1 + "      " + " %.3f",valueinKm1);
            ++valueinMiles1;
            valueinMiles2 = valueinKm2/1.609;
            System.out.printf("       "+valueinKm2+"      "+"%.3f",valueinMiles2);
            valueinKm2+=5;
            System.out.println("  ");
        }
    }
}
