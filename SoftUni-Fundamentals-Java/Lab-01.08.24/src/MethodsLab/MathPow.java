package MethodsLab;

import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int power = scanner.nextInt();
        System.out.printf("%.0f",toPower(number,power));
    }

    private static double toPower(double number, int power) {

        return Math.pow(number,power);

    }
}
