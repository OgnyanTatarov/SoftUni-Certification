package MoreExercises;

import java.util.Hashtable;
import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<String,Double> games = new Hashtable<>(){
            {
            put("OutFall 4",39.99d);
            put("CS: OG",15.99d);
            put("Zplinter Zell",19.99d);
            put("Honored 2",59.99d);
            put("RoverWatch",29.99d);
            put("RoverWatch Origins Edition",39.99d);
            }
        };
        double budget = Double.parseDouble(scanner.nextLine());
        double totalSpent = 0;
        String input = scanner.nextLine();
        while (!input.equals("Game Time") && budget > 0 ){
            if (!games.containsKey(input)) System.out.println("Not found");
            else if (budget < games.get(input)) System.out.println("Too Expensive");
            else {
                budget -= games.get(input);
                totalSpent += games.get(input);
                System.out.printf("Bought %s\n",input);
            }
            input = scanner.nextLine();
        }
        if (budget == 0){
            System.out.println("Out of money");
            return;
        }else System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpent, budget);
    }
}
