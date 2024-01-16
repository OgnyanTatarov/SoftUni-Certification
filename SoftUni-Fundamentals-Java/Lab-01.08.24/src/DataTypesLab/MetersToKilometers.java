package DataTypesLab;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = scanner.nextInt();
        double kilometers = meters / 1000d;
        System.out.printf("%.2f",kilometers);
    }
}
