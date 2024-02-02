package ArrayMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endPoint =Integer.parseInt(scanner.nextLine());
        int[] encrypted = new int[endPoint];
        char[] vowels = {'A','a','E','e','I','i','O','o','U','u'};
        for (int i = 0; i < endPoint; i++) {
            String input = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < input.length(); j++) {
                int valueChar = (int)input.charAt(j);
                if (isVowel(vowels,input.charAt(j)))sum += valueChar * input.length();
                else sum += valueChar / input.length();
            }
            encrypted[i]=sum;
        }
        Arrays.sort(encrypted);
        for (int number:encrypted) {
            System.out.println(number);
        }
    }
    public static boolean isVowel(char[] vowels,char character){
        for (char vowel:vowels
             ) {
            if (vowel == character)return true;

        }
        return false;
    }


}
