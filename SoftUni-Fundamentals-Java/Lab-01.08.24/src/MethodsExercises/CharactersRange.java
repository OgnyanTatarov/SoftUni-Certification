package MethodsExercises;

import java.util.Scanner;

public class CharactersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        getCharactersBetween(start,end);
    }

    private static void getCharactersBetween(char start, char end) {
        int startPoint = Math.min((int)start,(int)end);
        int endPoint = Math.max((int)start,(int)end);
        for (int i = startPoint + 1; i < endPoint ; i++) {
            System.out.printf("%c ",(char)i);
        }
    }
}
