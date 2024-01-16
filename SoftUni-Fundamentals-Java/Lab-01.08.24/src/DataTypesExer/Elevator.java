package DataTypesExer;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountPeople = scanner.nextInt(), capacity = scanner.nextInt();
        System.out.println(Math.ceil((double)amountPeople / capacity));
    }
}
