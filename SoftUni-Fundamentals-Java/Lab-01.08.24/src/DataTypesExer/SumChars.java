package DataTypesExer;

import java.util.Scanner;

public class SumChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine()),sum = 0;
        for (int i = 1; i <= rows ; i++) {
            char character = scanner.nextLine().charAt(0);
            sum += (int)character;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
