package MethodsLab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);
        double b = Double.parseDouble(scanner.nextLine());
        switch(operation){
            case '+':
                addNumbers(a,b);
                break;
            case '-':
                subtractNumbers(a,b);
                break;
            case '*':
                multiplyNumbers(a,b);
                break;
            case '/':
                divideNumbers(a,b);
        }
    }

    private static void divideNumbers(double a, double b) {
        System.out.printf("%.0f",a/b);
    }

    private static void multiplyNumbers(double a, double b) {
        System.out.printf("%.0f",a*b);
    }

    private static void subtractNumbers(double a, double b) {
        System.out.printf("%.0f",a-b);
    }

    private static void addNumbers(double a, double b) {
        System.out.printf("%.0f",a+b);
    }
}
