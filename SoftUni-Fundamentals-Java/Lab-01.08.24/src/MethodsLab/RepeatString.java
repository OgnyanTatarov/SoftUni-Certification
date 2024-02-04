package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int repeate = scanner.nextInt();
        System.out.println(repeatedString(string,repeate));
    }

    private static String repeatedString(String string, int repeate) {
        String newString = "";
        for (int i = 0; i < repeate; i++) {
            newString += string;
        }
        return newString;
    }
}
