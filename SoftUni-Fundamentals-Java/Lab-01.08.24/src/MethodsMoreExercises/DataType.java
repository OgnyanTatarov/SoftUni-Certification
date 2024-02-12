package MethodsMoreExercises;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")){
            printResult(scanner.nextInt());
        }else if(type.equals("real")){
            printResult(scanner.nextDouble());
        }else{
            printResult(scanner.nextLine());
        }





    }

    private static void printResult(String s) {
        System.out.println("$"+s+"$");
    }

    private static void printResult(Double s) {
        System.out.printf("%.2f\n",s*1.5d);
    }

    private static void printResult(int a) {
        System.out.println(a*2);
    }

}
