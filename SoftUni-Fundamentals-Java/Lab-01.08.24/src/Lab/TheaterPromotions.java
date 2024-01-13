package Lab;

import java.util.Scanner;

public class TheaterPromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();
        int age = scanner.nextInt();
        int price = 0;
        switch (dayOfWeek){
            case "Weekday":
                if (age < 0)price = 0;
                else if (age > 18 && age <= 64 ) price = 18;
                else{
                    price = 12;
                }break;
            case "Weekend":
                if (age < 0)price = 0;
                else if (age > 18 && age <= 64) price = 20;
                else{
                    price = 15;
                }break;
            case "Holiday":
                if (age < 0)price = 0;
                else if (age >= 0 && age <= 18) price = 5;
                else if (age > 18 && age <= 64){
                    price = 12;
                }else price = 10;
                break;
        }
        if (price != 0) System.out.printf("%d$",price);
        else System.out.println("Error!");
    }
}
