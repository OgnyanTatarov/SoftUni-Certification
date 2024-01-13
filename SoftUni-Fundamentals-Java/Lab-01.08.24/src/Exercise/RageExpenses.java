package Exercise;

import java.util.Hashtable;
import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loseStreak = scanner.nextInt();
        double headsetPrice = scanner.nextDouble();
        double mousePrice = scanner.nextDouble();
        double keyboardPrice = scanner.nextDouble();
        double displayPrice = scanner.nextDouble();
        double totalPrice = 0;
        Hashtable<String,Integer>trashedSetup = new Hashtable<>(){
            {
            put("headset",loseStreak/2);
            put("mouse",loseStreak/3);
            put("keyboard",loseStreak/6);
            put("display",loseStreak/12);
            }
        };
        headsetPrice *= trashedSetup.get("headset");
        mousePrice *= trashedSetup.get("mouse");
        keyboardPrice *= trashedSetup.get("keyboard");
        displayPrice *= trashedSetup.get("display");
        totalPrice = headsetPrice + mousePrice + keyboardPrice + displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",totalPrice);


    }
}
