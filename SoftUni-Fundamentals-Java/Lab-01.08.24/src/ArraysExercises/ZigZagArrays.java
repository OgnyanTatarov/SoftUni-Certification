package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            if (i % 2 == 0 || i == 0){
                firstArray[i] = firstNumber;
                secondArray[i] = secondNumber;
            }else{
                firstArray[i] = secondNumber;
                secondArray[i] = firstNumber;
            }
        }

        for (int number : firstArray){
            System.out.printf("%d ",number);
        }
        System.out.println();
        for (int number: secondArray){
            System.out.printf("%d ",number);
        }

    }
}
