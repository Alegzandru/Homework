package md.tekwill.exercises.inputoutput;

public class WhileDemo {
    public static void main(String[] args) {
        boolean bunsAvailable = true;
        int totalBuns = 40;
        int numberOfBurgers = 1;
        while(bunsAvailable){
            if (totalBuns == 0)
                bunsAvailable = false;
            System.out.println("Prepairing burger " + numberOfBurgers);
            --totalBuns;
            System.out.println("Placing ingredients");
            --totalBuns;
            System.out.println("Burger is prepared.\n");
            numberOfBurgers++;
        }
    }
}
