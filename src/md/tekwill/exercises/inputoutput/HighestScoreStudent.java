package md.tekwill.exercises.inputoutput;

import java.util.Scanner;

public class HighestScoreStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int numberStudents = input.nextInt();
        String topstudentName = "Unknown";
        int topstudentScore = 0;
        String topsecondstudentName = "Unknown";
        int topsecondstudentscore = 0;
        for (int i = 0; i<numberStudents;i++){
            input.nextLine();
            System.out.println("Enter the student name : ");
            String studentName = input.nextLine();
            System.out.println("Enter score :");
            int studentScore = input.nextInt();
            if (studentScore > topstudentScore){
                topstudentName =studentName;
                topstudentScore = studentScore;
            }

        }
    }
}
