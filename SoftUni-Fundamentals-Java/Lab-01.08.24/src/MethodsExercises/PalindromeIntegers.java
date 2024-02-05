package MethodsExercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END"))
        {
            System.out.println(isPolindrome(input));
            input = scanner.nextLine();
        }
    }

    private static boolean isPolindrome(String input) {
        boolean isValid = false;
        int j = input.length()-1;
        int i = 0;
        while (!isValid && j > i)
        {
            if (input.charAt(i) == input.charAt(j)) isValid = true;
            else isValid = false;
            i++;
            j--;
        }
        return isValid;
    }
}
