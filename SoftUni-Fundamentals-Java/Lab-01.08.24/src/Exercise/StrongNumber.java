package Exercise;

import java.util.Scanner;



public class StrongNumber {
    public static int toFactorial(int number){
        if (number == 0)return 1;
        return number * toFactorial(number-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumFactorials = 0;
        int digits = number;
        while(digits > 0){
            sumFactorials+=toFactorial(digits%10);
            digits/=10;
        }
        if (number == sumFactorials) System.out.println("yes");
        else System.out.println("no");
    }
}
