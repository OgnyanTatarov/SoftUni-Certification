package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();
        while(inputArray.length > 1)
            {
                int[] condenseArray = new int[inputArray.length - 1];
                    for (int i = 0; i <= inputArray.length-2; i++) {
                        condenseArray[i] = inputArray[i] + inputArray[i + 1];
                    }
                    inputArray = condenseArray;
                }
        System.out.println(inputArray[0]);
    }
}
