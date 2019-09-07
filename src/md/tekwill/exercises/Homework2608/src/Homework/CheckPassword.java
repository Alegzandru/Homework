package Homework;

import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class CheckPassword {


    public static void main(String[] args) {
        CheckPassword check= new CheckPassword();
        check.checkPassword(check.enterPassword());

    }


    public String enterPassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password:");
        System.out.println("It must have at least 8 characters, of which only letters and digits and at least 2 must be digits");
        String password = input.nextLine();
        return password;
    }


    public void checkPassword(String password){
        if (password.length()>=8&&checkForLettersAndDigits(password)&&checkForTwoDigits(password))
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");
    }


    public boolean checkForLettersAndDigits(String password){
        int z = 0;
        boolean valid = false;
        for (int i = 0; i<password.length();i++){
            if (Character.isDigit(password.charAt(i))||Character.isLetter(password.charAt(i)))
                z++;
        }
        if (z==password.length())
            valid = true;
        return valid;
    }



    public boolean checkForTwoDigits (String password){
        int z = 0;
        boolean valid = false;
        for (int i = 0; i<password.length();i++){
            if (Character.isDigit(password.charAt(i)))
                z++;
        }
        if (z>=2)
            valid = true;
        return valid;

    }
}
