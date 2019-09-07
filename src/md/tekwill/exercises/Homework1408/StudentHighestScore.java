package md.tekwill.exercises.Homework1408;

import java.util.Scanner;

public class StudentHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int numberofStudents = input.nextInt();
        input.nextLine();
        int tophighestScore = 0;
        String tophighestStudent = "unknown";
        int topsecondhighestScore = 0;
        String topsecondhighestStudent = "unknown";
        for (int i = 1; i <= numberofStudents; ++i) {
            System.out.println("Enter the student name:");
            String studentName = input.nextLine();
            System.out.println("Enter the student score:");
            int studentScore = input.nextInt();
            input.nextLine();
            if (i == 1) {
                topsecondhighestScore = studentScore;
                topsecondhighestStudent = studentName;
            } else {
                if (studentScore > tophighestScore) {
                    tophighestStudent = studentName;
                    tophighestScore = studentScore;
                } else if (studentScore > topsecondhighestScore && studentScore < tophighestScore) {
                    topsecondhighestScore = studentScore;
                    topsecondhighestStudent = studentName;
                }
            }

            }
        if (topsecondhighestScore>tophighestScore){
            int a = tophighestScore;
            String a1 = tophighestStudent;
            int b = topsecondhighestScore;
            String b1 = topsecondhighestStudent;
            tophighestScore=b;
            tophighestStudent=b1;
            topsecondhighestScore=a;
            topsecondhighestStudent=a1;
        }
            System.out.println("The student with the best score is " + tophighestStudent + ", ");
            System.out.print("with the score of " + tophighestScore);
            System.out.println(" ");
            System.out.println("The second best student is " + topsecondhighestStudent + ", ");
            System.out.print("with a score of " + topsecondhighestScore);
    }
}