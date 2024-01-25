package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();
        int sumEven = 0, sumOdd = 0;
        for (int number: array
             ) {
            if (number % 2 == 0)sumEven += number;
            else sumOdd += number;
        }
        System.out.println(sumEven - sumOdd);
    }
}
