package Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MonthDayCalculator {
    int initial = 31;
    int firstDay = 0;
    int month = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initialday = input.nextInt();
        MonthDayCalculator months = new MonthDayCalculator();
        System.out.println(months.dependingOnMonth(initialday, 31));

    }

    public String dependingOnMonth(int initialDay, int finalDay) {
        for (; month <= 12; month++) {
            for (; initialDay <= 7; initialDay++) {
                firstDay++;
                if (firstDay < initialDay && initialDay == 7)
                    initialDay = 1;
                if (firstDay == finalDay) {
                    if (month==2)
                        finalDay=28;
                    if (month==3)
                        finalDay=31;
                    if (month==4)
                        finalDay=30;
                    if (month==5)
                        finalDay=30;
                    if (month==6)
                        finalDay=30;
                    if (month==7)
                        finalDay=30;
                    if (month==8)
                        finalDay=30;
                    if (month==9)
                        finalDay=30;
                    if (month==10)
                        finalDay=30;
                    if (month==11)
                        finalDay=30;
                    if (month==12)
                        finalDay=30;
                    if (initialDay == 1)
                        return "Monday";
                    if (initialDay == 2)
                        return "Tuesday";
                    if (initialDay == 3)
                        return "Wednesday";
                    if (initialDay == 4)
                        return "Thursday";
                    if (initialDay == 5)
                        return "Friday";
                    if (initialDay == 6)
                        return "Saturday";
                    if (initialDay == 7)
                        return "Sunday";

                }
            }
        }
        return "";
    }
}
