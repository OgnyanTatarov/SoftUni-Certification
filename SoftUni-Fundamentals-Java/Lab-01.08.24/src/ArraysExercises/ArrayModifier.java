package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[]command = scanner.nextLine().split(" ");
        while(!command[0].equals("end")){
            switch (command[0]){
                case "swap":
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex=Integer.parseInt(command[2]);
                    int firstNumber = array[firstIndex];
                    array[firstIndex] = array[secondIndex];
                    array[secondIndex] = firstNumber;
                    break;

                case "multiply":
                    firstIndex = Integer.parseInt(command[1]);
                    secondIndex= Integer.parseInt(command[2]);
                    array[firstIndex] = array[firstIndex] * array[secondIndex];
                    break;

                case"decrease":
                    for (int i = 0; i < array.length;i++) {
                        array[i] -= 1;
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < array.length-1; i++) {
            System.out.printf("%d, ",array[i]);
        }
        System.out.printf("%d",array[array.length-1]);
    }
}
