package MethodsLab;

import java.util.Scanner;

public class MultiplyEvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(getMultipliedEvenOdds(number));
    }

    private static int getMultipliedEvenOdds(int number) {
        return getEvenNumbers(number);
    }

    private static int getEvenNumbers(int number) {
        int sumEven = 0;
        int sumOdd = 0;
        while(Math.abs(number) > 0){
            int digit = number % 10;
            if (digit % 2 == 0)sumEven+=digit;
            else sumOdd+= digit;
            number/=10;
        }
        return sumEven * sumOdd;
    }
}
