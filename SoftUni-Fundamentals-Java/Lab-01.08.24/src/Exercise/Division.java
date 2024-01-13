package Exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int maxDivisible = 0;
        int[]dividers = new int[]{2,3,6,7,10};
        for (int divider:dividers
             ) {if (number  % divider == 0)maxDivisible = divider;
        }
        if (maxDivisible !=0) System.out.printf("The number is divisible by %d",maxDivisible);
        else System.out.print("Not divisible");

    }
}
