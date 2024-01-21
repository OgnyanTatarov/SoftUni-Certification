package DataTypesExerMore;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eps = 0.000001;
        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());
        boolean areEqual = false;
        double difference =Math.abs(numberA - numberB);
        if (difference < eps)areEqual = true;
        if (areEqual) System.out.println("True");
        else System.out.println("False");
    }
}
