package Exercise;

import java.util.Hashtable;
import java.util.Scanner;

public class VendingMachine {
    public static Double checkCanPurchase(String product,Hashtable products,double totalMoney){
        if (products.containsKey(product)){
            double priceProduct = (double)products.get(product);
            if (priceProduct<=totalMoney){
                System.out.printf("Purchased %s\n",product);
                totalMoney -= priceProduct;
            }
            else System.out.println("Sorry, not enough money");
        }
        else System.out.println("Invalid product");
        return totalMoney;
    }
    public static Double checkCanAcceptCoin(String input,Hashtable coins){
        double totalMoney = 0;
        double coin = Double.parseDouble(input);
        if (coins.containsKey(coin))totalMoney+=(double)coins.get(coin);
        else System.out.printf("Cannot accept %.2f\n",coin);
        return totalMoney;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Double , Double> coins = new Hashtable<>(){
            {
                put(0.1,0.1);
                put(0.2,0.2);
                put(0.5,0.5);
                put(1d,1d);
                put(2d,2d);
            }


        };
        Hashtable<String,Double> products = new Hashtable<>(){
            {
                put("Nuts",2d);
                put("Water",0.7d);
                put("Crisps",1.5d);
                put("Soda",0.8d);
                put("Coke",1d);
            }

        };
        double totalMoney = 0;
        String input = scanner.nextLine();

        while(!input.equals("Start")){
            totalMoney += checkCanAcceptCoin(input,coins);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while(!input.equals("End")){
            totalMoney= checkCanPurchase(input,products,totalMoney);
            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f\n",totalMoney);
    }

}
