package DataTypesLab;

import java.util.Scanner;

public class SpecialNumber {
    public static boolean isSpecial(int number){
        boolean result = false;
        int sum = 0;
        while(number > 0)
        {
            sum  += number % 10;
            number/=10;
        }
        if (sum == 5 || sum == 7 || sum == 11)result=true;
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        for (int i = 1; i <= range ; i++) {
            if (isSpecial(i)) System.out.printf("%d -> True\n",i);
            else System.out.printf("%d -> False\n",i);
        }
    }
}
