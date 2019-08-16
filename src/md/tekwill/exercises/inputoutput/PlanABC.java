package md.tekwill.exercises.inputoutput;

public class PlanABC {
    public static void main(String[] args) {
        int plan = 1;
        plan = plan++ + --plan;
        System.out.println(plan);
    }
}
