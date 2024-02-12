package ListLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> listProducts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String currentProduct = scanner.nextLine();
            listProducts.add(currentProduct);
        }

        Collections.sort(listProducts);

        for (int i = 1; i <= n ; i++) {
            System.out.printf("%d.%s\n",i,listProducts.get(0));
            listProducts.remove(0);
        }
    }
}
