package Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeGroup = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayWeek = scanner.nextLine();
        double totalPrice = 0;
        double totalDiscount = 0;
        switch (typeGroup){
            case "Students":
                if (sizeGroup >= 30)totalDiscount = 0.15;
                break;
            case "Business":
                if (sizeGroup >= 100)sizeGroup-=10;
                break;
            case "Regular":
                if (sizeGroup >= 10 && sizeGroup <= 20)totalDiscount = 0.05;
                break;
        }
        switch (dayWeek){
            case "Friday":
                if(typeGroup.equals("Students")) totalPrice = sizeGroup * 8.45d;
                else if(typeGroup.equals("Business"))totalPrice = sizeGroup * 10.90d;
                else totalPrice = sizeGroup * 15d;
                break;
            case "Saturday":
                if(typeGroup.equals("Students")) totalPrice = sizeGroup * 9.80d;
                else if(typeGroup.equals("Business"))totalPrice = sizeGroup * 15.60d;
                else totalPrice = sizeGroup * 20d;
                break;
            case "Sunday":
                if(typeGroup.equals("Students")) totalPrice = sizeGroup * 10.46d;
                else if(typeGroup.equals("Business"))totalPrice = sizeGroup * 16d;
                else totalPrice = sizeGroup * 22.50d;
                break;
        }
        totalPrice *= (1-totalDiscount);
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
