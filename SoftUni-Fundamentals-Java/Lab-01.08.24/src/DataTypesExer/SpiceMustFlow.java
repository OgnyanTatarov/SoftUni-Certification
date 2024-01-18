package DataTypesExer;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = scanner.nextInt();
        int totalSpices = 0,days = 0;
        while (yield >= 100){
            totalSpices += yield;
            days++;
            if (totalSpices >= 26)totalSpices-=26;
            yield -=10;
        }
        if(totalSpices >= 26) totalSpices-=26;
        System.out.println(days);
        System.out.println(totalSpices);
    }
}
