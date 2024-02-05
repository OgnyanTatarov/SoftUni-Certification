package MethodsExercises;

import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();

        System.out.println(subract(add(a,b),c));
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int subract(int a, int b){
        return a-b;
    }
}
