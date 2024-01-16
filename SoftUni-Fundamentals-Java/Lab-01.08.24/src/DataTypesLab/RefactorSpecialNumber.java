package DataTypesLab;

import java.util.Scanner;

public class RefactorSpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;
        boolean isSpecialNum = false;
        for (int ch = 1; ch <= range; ch++) {
           int number = ch;
            while (number > 0) {
                sumDigits += number % 10;
                number = number / 10;
            }
            isSpecialNum = (sumDigits == 5) || (sumDigits == 7) || (sumDigits == 11);
            System.out.printf("%d -> %b%n", ch, isSpecialNum);
            sumDigits = 0;
        }

    }
}
