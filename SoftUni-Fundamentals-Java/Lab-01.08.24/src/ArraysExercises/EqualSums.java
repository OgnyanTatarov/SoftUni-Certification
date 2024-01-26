package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int resultIndex = -1,sumLeft=0,sumRight = 0;
        if (array.length == 1){
            System.out.println(0);
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if(i != 0 )
            {
                sumLeft+= array[i-1];
            }
            for (int j = i + 1; j <= array.length - 1 ; j++) {
                sumRight+=array[j];
            }
            if (sumLeft == sumRight)resultIndex = i;
            sumRight = 0;
        }
        if (resultIndex != -1)System.out.printf("%d",resultIndex);
        else System.out.println("no");
    }
}
