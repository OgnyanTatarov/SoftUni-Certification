package MethodsExercises;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        getMatrix(n);
    }

    private static void getMatrix(int n) {
        String repitedString =String.format("%d ",n).repeat(n);
        for (int i = 0; i < n; i++) {
            System.out.println(repitedString);
        }
    }
}
