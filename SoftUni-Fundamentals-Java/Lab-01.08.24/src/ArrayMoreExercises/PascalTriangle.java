package ArrayMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int [] firstRow = new int[rows];
        firstRow[0]= 1;//
        for (int i = 1; i <= rows; i++) {
            int [] secondRow = new int[i + 1];

            for (int j = 0; j < i+1; j++) {
                if (j -1 < 0)
                {
                    secondRow[j] = firstRow[j];
                }else if(j >= firstRow.length)
                {
                    secondRow[j] = firstRow[j-1];
                }
                else{
                    secondRow[j]=firstRow[j-1]+firstRow[j];
                }

            }
            Arrays.stream(firstRow)
                    .filter(element -> element != 0)
                    .forEach(element -> System.out.printf("%d ",element));
            firstRow = secondRow;
            System.out.println();
        }
    }
}
