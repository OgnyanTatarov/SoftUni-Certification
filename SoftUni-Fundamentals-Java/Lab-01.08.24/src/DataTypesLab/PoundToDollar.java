package DataTypesLab;

import java.util.Scanner;

public class PoundToDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();
        double dollars = pounds * 1.36d;
        System.out.printf("%.3f",dollars);
    }
}
