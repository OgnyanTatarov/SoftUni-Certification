package Lab;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = scanner.nextDouble();
        if (grade >= 3.00d){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
