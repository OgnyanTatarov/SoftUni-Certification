package DataTypesExer;

import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt(), end = scanner.nextInt();
        for (int i = start; i <= end ; i++) {
            System.out.printf("%c ",(char)i);
        }
    }
}
