package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class Choices4letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one of the following choices :");
        System.out.println("f)java               g)python ");
        System.out.println("h)php                i)Perl   ");
        boolean exitt = false ;
        for (;!exitt;){
            String value = input.next();
            switch (value.toLowerCase()) {
                case "f":
                    System.out.println("You chose to learn the programming language java");
                    exitt =true;
                    break;
                case "g":
                    System.out.println("You chose to learn the programming language python");
                    exitt =true;
                    break;
                case "h":
                    System.out.println("You chose to learn the programming language php");
                    exitt =true;
                    break;
                case "i":
                    System.out.println("You chose to learn the programming language Perl");
                    exitt =true;
                    break;
                case "exit":
                    exitt = true ;
                    break;
                default:
                    System.out.println(" Enter a valid option or type exit to exit the program");
                    break;
            }
        }
    }
}
