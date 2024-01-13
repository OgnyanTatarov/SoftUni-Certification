package Lab;

import java.util.Scanner;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int times = scanner.nextInt();
        if (times > 10) System.out.printf("%d X %d = %d\n",number,times,number*times);
        for (int i = times; i<=10;i++) System.out.printf("%d X %d = %d\n",number,i,number*i);
    }
}
