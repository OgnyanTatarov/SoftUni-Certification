package DataTypesExerMore;

import java.util.Scanner;

public class LeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLines = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= inputLines ; i++) {
            String[] input = scanner.nextLine().split(" ");
            long leftNumber = Long.parseLong(input[0]);
            long rightNumber = Long.parseLong(input[1]);
            if (leftNumber > rightNumber){
                sumOfDigits(leftNumber);
            }else sumOfDigits(rightNumber);
        }
    }
    public static void sumOfDigits(long number){
        long sum = 0;
        number = Math.abs(number);
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }

}
