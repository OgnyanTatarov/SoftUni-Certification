package DataTypesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.nextLine().charAt(0);
        if ((int)character >= 65 && (int)character <= 90) System.out.println("upper-case");
        else System.out.println("lower-case");
    }
}
