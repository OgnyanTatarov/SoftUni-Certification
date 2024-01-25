package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int sizeArray = array.length-1;
        for (int i = 0; i <= sizeArray /2  ; i++) {
            String string = array[i];
            array[i] = array[sizeArray - i ];
            array[sizeArray - i] = string;
        }

        for (String i:array
             ) {
            System.out.print(i + " ");
        }
    }
}
