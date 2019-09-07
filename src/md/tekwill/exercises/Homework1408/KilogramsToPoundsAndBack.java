package md.tekwill.exercises.Homework1408;

public class KilogramsToPoundsAndBack {
    public static void main(String[] args) {
        int valueKg1 =1;
        float valueP1 =1;
        int valueP2=20;
        float valueKg2=1;
        System.out.println("Kilograms      Pounds   |      Pounds         Kilograms");
        for (int i = 1; i<=199; i+=2){
        valueP1 = valueKg1*2.2f;
            System.out.printf(valueKg1+"        "+"%.1f",valueP1);
            valueKg1+=2;
            valueKg2 = valueP2/2.2f;
            System.out.printf("            "+valueP2+"        "+"%.1f",valueKg2);
            valueP2+=5;
            System.out.println(" ");
        }
    }
}
