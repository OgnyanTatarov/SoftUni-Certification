package Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double priceOrder = 0,totalOrder = 0;
        for (int i = 1; i <= n ; i++) {
            double priceCapsule = scanner.nextDouble();
            int days = scanner.nextInt();
            int capsulesCount = scanner.nextInt();
            priceOrder = priceCapsule * days * capsulesCount ;
            totalOrder += priceOrder;
            System.out.printf("The price for the coffee is: $%.2f\n",priceOrder);
            priceOrder = 0;
        }
        System.out.printf("Total: $%.2f\n",totalOrder);
    }
}
