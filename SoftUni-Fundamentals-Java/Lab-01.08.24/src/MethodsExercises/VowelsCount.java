package MethodsExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        getCountVowels(input);

    }

    private static void getCountVowels(String input) {
    HashMap<Character,Integer> vowels = new HashMap<Character,Integer>(){{
        put('a', 1);
        put('e',1);
        put('i',1);
        put('u',1);
        put('o',1);
    }};

    input = input.toLowerCase();
    int count = 0;
        for (int i = 0; i < input.length() ; i++) {
            char character = input.charAt(i);
            if (vowels.containsKey(character))count++;
        }
        System.out.println(count);
    }
}
