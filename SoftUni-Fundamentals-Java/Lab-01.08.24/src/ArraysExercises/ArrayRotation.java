package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int numberRotations = scanner.nextInt();
        for (int i = 0; i < numberRotations; i++) {
          int firstElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1]=firstElement;
        }

        for (int number: array) {
            System.out.printf("%d ",number);
        }
    }
}
