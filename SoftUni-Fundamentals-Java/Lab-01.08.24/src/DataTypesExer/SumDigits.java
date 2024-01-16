package DataTypesExer;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(),sum = 0;
        while(number > 0){
            sum+=number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
