package md.tekwill.exercises.inputoutput;

public class Lanterns {
    public static void main(String[] args) {
        roofSpace();
        roof();
        light1();
        roofSpace();
        roof();
        light2();

    }
    public static void roof(){
        System.out.println ("    *****    ");
        System.out.println ("  *********  ");
        System.out.println ("*************");
    }
    public static void roofSpace(){
        roof();
        System.out.println(" ");
    }
    public static void light1(){
        System.out.println("* | | | | | *");
        System.out.println("*************");
    }
    public static void light2(){
        System.out.println("    *****    ");
        System.out.println("* | | | | | *");
        System.out.println("* | | | | | *");
        System.out.println("    *****    ");
        System.out.println("    *****    ");
    }
}
