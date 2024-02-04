package MethodsLab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type){
            case "int":
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(getMax(a,b));
                break;
            case "char":
                char a1 = scanner.nextLine().charAt(0);
                char b2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(a1,b2));
                break;
            case "string":
                String a3 = scanner.nextLine();
                String b4 = scanner.nextLine();
                System.out.println(getMax(a3,b4));
                break;
        }
    }

    private static int getMax(int a, int b) {
    return Math.max(a,b);
    }
    private static char getMax(char a, char b){
        if (a > b)return a;
        else return b;
    }
    private static String getMax(String a, String b){
        if(a.compareTo(b) < 0) return b;
        return a;
    }


}
