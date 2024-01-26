package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonCount = scanner.nextInt();
        int[] train = new int[wagonCount];
        for (int i = 0; i < wagonCount; i++) {
            int peopleOn = scanner.nextInt();
            train[i]=peopleOn;
        }
        for (int j : train) {
            System.out.printf("%d ", j);
        }
        System.out.println();
        System.out.println(Arrays.stream(train).sum());
    }
}
