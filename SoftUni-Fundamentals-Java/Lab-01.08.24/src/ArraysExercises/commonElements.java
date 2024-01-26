package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
        String[] answer = new String[secondArray.length];
        int k = 0;
        for (int i = 0; i < secondArray.length; i++) {
            String element = secondArray[i];
            for (int j = 0; j < firstArray.length; j++) {
                if (element.equals(firstArray[j])){
                    answer[k] = firstArray[j];
                    k++;
                }
            }
        }
        for (int i = 0; i < k ; i++ ) {
            System.out.printf("%s ",answer[i]);
        }
    }
}
