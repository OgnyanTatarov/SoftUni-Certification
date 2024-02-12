package MethodsMoreExercises;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num == 0 || num2 == 0 || num3 ==0) System.out.println("zero");
        else if (num > 0 && num2 > 0 && num3 > 0 || getNegetavieNumber(num,num2,num3)) System.out.println("positive");
        else System.out.println("negative");
    }

    private static boolean getNegetavieNumber(int num, int num2, int num3) {
        if (num < 0 && num2 < 0 && num3 < 0)return false;
        return num < 0 && (num2 < 0 || num3 < 0);

    }
}
