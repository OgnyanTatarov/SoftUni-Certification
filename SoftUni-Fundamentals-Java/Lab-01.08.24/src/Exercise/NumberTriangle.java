package Exercise;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int depth = scanner.nextInt();
        for (int i = 1; i <= depth ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
}
