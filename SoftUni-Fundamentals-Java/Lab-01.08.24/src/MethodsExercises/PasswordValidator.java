package MethodsExercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        validatePassword(password);
    }

    private static void validatePassword(String password) {
       boolean isCorrectLength = checkLength(password);
       boolean isValidInput = checkValidInput(password);
       boolean isValidNumbersCount = checkCountNumbers(password);
       if (isValidNumbersCount && isValidInput && isCorrectLength){
           System.out.println("Password is valid");
           return;
       }
       if (!isCorrectLength) System.out.println("Password must be between 6 and 10 characters");
       if (!isValidInput) System.out.println("Password must consist only of letters and digits");
       if (!isValidNumbersCount) System.out.println("Password must have at least 2 digits");
    }

    private static boolean checkCountNumbers(String password) {
        int count =0;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            int asciValue = (int) character;
            if (asciValue >= 48 && asciValue <= 57) count ++;
        }
        return count >= 2;
    }

    private static boolean checkValidInput(String password) {
       boolean isValid = false;
       password = password.toLowerCase();
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            int asciValue = (int) character;
            if (asciValue >= 48 && asciValue <= 57)isValid = true;
            else if(asciValue >= 97 && asciValue <= 122) isValid = true;
            else return false;
        }
        return true;
    }

    private static boolean checkLength(String password) {
        boolean isValid = password.length() >= 6 && password.length() <= 10;
        return isValid;
    }
}
