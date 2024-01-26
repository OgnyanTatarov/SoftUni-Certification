package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length-1; i++) {
            boolean isTop = false;
            for (int j = i+1; j <= array.length-1; j++) {
                if (array[i] > array[j])isTop = true;
                else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) System.out.printf("%d ", array[i]);

        }
        System.out.printf("%d",array[array.length - 1]);
    }
}
