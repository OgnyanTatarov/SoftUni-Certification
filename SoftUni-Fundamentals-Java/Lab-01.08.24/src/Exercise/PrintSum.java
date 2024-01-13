package Exercise;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        int sum = 0;
        for (int start = startIndex; start <= endIndex; start++){
            System.out.print(start + " ");
            sum += start;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
