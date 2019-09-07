package Homework;

public class DaysYears {


    public static void main(String[] args) {
        DaysYears methodCaller = new DaysYears();
        System.out.println(methodCaller.calculateNumberOfYears(10));
    }


    public int calculateNumberOfYears (int years){
        int days = 366 * (years/4) + (years-(years/4))*365;
        return days;
    }
}
