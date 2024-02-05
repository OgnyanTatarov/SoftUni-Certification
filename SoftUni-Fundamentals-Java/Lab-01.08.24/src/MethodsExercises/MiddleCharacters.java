package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(getMiddleCharacters(input));
    }

    private static String getMiddleCharacters(String input) {
        int midPoint = input.length()/2;
        String output = "";
        if (input.length() % 2 == 0){
            output += input.charAt(midPoint -1);
            output += input.charAt(midPoint);
            return output;
        }

        return String.valueOf(input.charAt(input.length()/2));
    }
}
