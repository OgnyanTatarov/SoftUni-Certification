package Lab;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double grade = scanner.nextDouble();
        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
        }
    }
