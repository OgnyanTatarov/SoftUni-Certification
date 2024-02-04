package MethodsLab;

import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        System.out.printf("%.0f",getArea(width,length));

    }

    private static double getArea(double width,double length) {
        return width * length;
    }
}
