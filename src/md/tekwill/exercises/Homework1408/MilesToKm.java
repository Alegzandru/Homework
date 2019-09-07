package md.tekwill.exercises.Homework1408;

public class MilesToKm {
    public static void main(String[] args) {
        System.out.println("Miles     Km");
        int valueinMiles = 1;
        for (int i = 1; i <= 10; ++i) {
            double valueinKm = valueinMiles * 1.609;
            System.out.println(valueinMiles + "      " + valueinKm);
            ++valueinMiles;
        }
    }
}