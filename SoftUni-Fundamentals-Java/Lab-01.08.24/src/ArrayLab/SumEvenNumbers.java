package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumbers =Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        for (int number: arrayNumbers
             ) {
            if (number % 2 == 0)sum+=number;
        }
        System.out.println(sum);
    }
}
