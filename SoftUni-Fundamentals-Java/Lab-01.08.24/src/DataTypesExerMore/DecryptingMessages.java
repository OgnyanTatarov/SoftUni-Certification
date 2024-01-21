package DataTypesExerMore;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int numberLines = Integer.parseInt(scanner.nextLine());
        String output = "";
        for (int i = 0; i < numberLines ; i++) {
            char character = scanner.nextLine().charAt(0);
            output += (char)((int)character + key);
        }
        System.out.println(output);
    }
}
