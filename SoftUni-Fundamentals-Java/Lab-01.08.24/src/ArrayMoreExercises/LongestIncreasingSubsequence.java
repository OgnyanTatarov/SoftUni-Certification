package ArrayMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] lis = findLIS(arr);

        for (int number:lis) {
            System.out.printf("%d ",number);
        }
    }

    public static int[] findLIS(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        Arrays.fill(lis, 1);

        int[] leftmostIndex = new int[n];
        Arrays.fill(leftmostIndex, -1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    leftmostIndex[i] = j;
                }
            }
        }

        int maxLength = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLength) {
                maxLength = lis[i];
                maxIndex = i;
            }
        }

        // Reconstruct the LIS
        int[] result = new int[maxLength];
        int currentIndex = maxIndex;

        for (int i = maxLength - 1; i >= 0; i--) {
            result[i] = arr[currentIndex];
            currentIndex = leftmostIndex[currentIndex];
        }

        return result;
    }
}

