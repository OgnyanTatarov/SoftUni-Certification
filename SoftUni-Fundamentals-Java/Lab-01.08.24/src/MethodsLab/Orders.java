package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double price = scanner.nextDouble();
        getPrice(product,price);
    }

    private static void getPrice(String product, double price) {
    switch (product){
        case "coffee":
            System.out.printf("%.2f",price * 1.50d);
            break;
        case "water":
            System.out.printf("%.2f", price * 1.00d);
            break;
        case "coke":
            System.out.printf("%.2f", price * 1.4);
            break;
        case "snacks":
            System.out.printf("%.2f", price * 2.00d);
    }


    }
}
