package Lab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        switch (country){
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Mexico":
            case "Spain":
            case "Argentina":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
