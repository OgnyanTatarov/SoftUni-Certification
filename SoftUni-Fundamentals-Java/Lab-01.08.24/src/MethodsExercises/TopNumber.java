package MethodsExercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            if(isTopNumber(i)) System.out.println(i);;
        }


    }

    private static boolean isTopNumber(int i) {
        boolean hasOddDigit = false;
        int sum = 0;
        String input = Integer.toString(i);
        for (int j = 0; j < input.length(); j++) {
            int digit = (int) input.charAt(j);
            if (digit % 2 != 0)hasOddDigit = true;
            sum += digit;
        }
        if (hasOddDigit && sum % 8 == 0)return true;
        return false;

    }
}
