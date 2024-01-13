package MoreExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class NumberSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirthNumber = scanner.nextInt();
        Integer[] array = new Integer[]{firstNumber,secondNumber,thirthNumber};
        Arrays.sort(array,Collections.reverseOrder());
        for (int number:array) {
            System.out.println(number);

        }
    }
}
