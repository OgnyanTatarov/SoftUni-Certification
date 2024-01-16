package DataTypesExer;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberKegs = Integer.parseInt(scanner.nextLine());
        String nameBiggest = "";
        double largestVolume = Double.MIN_VALUE;
        for (int i = 0; i < numberKegs ; i++) {
            String nameKeg = scanner.nextLine();
            double radiusKeg = Double.parseDouble(scanner.nextLine());
            int heightKeg = Integer.parseInt(scanner.nextLine());
            double volumeKeg = Math.PI * Math.pow(radiusKeg,2) * heightKeg;
            if (volumeKeg > largestVolume){
                largestVolume = volumeKeg;
                nameBiggest = nameKeg;
            }
        }
        System.out.println(nameBiggest);
    }
}
