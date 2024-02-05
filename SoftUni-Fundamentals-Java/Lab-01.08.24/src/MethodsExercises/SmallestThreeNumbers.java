package MethodsExercises;

import java.util.Scanner;

public class SmallestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        findSmallest(number1,number2,number3);
    }

    private static void findSmallest(int number1, int number2, int number3) {
        System.out.println(Math.min(Math.min(number1,number2),number3));
    }
}
