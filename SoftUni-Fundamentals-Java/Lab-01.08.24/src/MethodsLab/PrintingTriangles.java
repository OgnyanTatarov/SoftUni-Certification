package MethodsLab;

import java.util.Scanner;

public class PrintingTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        getTriangle(number);
    }

    private static void getTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }

        for (int i = number-1; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}
