package Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int sum = 0;
        int oddNumber = 1;
        for (int i = 1 ;i<=target; i+=1){
            sum += oddNumber;
            System.out.println(oddNumber);
            oddNumber+=2;

        }
        System.out.printf("Sum: %d",sum);
    }
}
