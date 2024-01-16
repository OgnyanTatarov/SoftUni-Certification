package DataTypesExer;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt(),
            secondNumber = scanner.nextInt(),
            thirdNumber = scanner.nextInt(),
            fourthNumber = scanner.nextInt();
        System.out.println((firstNumber+secondNumber)/thirdNumber * fourthNumber);
    }
}
