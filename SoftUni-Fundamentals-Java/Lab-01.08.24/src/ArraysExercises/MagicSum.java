package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int targetSum = scanner.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                int sum = array[i] + array[j];
                if (sum == targetSum) {
                    System.out.printf("%d %d\n",array[i],array[j]);
                    break;
                }
            }
        }
    }
}
