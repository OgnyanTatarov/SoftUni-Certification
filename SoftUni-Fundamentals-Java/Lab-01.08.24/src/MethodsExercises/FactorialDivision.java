package MethodsExercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        double facA = findFactorial(a);
        double facB = findFactorial(b);
        System.out.printf("%.2f",(double)facA / facB);
    }

    private static long findFactorial(long b) {
        if (b == 1)return 1;
        return b * findFactorial(b-1);
    }
}
