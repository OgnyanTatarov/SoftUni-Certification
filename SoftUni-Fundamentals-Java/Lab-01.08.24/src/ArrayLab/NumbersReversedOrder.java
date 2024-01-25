package ArrayLab;

import java.util.Scanner;

public class NumbersReversedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endPoint = scanner.nextInt();
        int[] reversedOrder = new int[endPoint];
        for (int i = 0; i < endPoint ; i++) {
            int input = scanner.nextInt();
            reversedOrder[endPoint - i - 1] = input;
        }
        for (int i :reversedOrder
             ) {
            System.out.print(i + " ");

        }
    }
}
