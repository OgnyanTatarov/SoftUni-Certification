package DataTypesExer;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int lines = scanner.nextInt();
        for (int i = 0; i < lines ; i++) {
            int littersToPour = scanner.nextInt();
            if (capacity >= littersToPour)capacity -= littersToPour;
            else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(255 - capacity);
    }
}
