package DataTypesExer;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSnowBalls = scanner.nextInt();
        long[] bestSnowball = new long[4];
        for (int i = 1; i <= numberSnowBalls ; i++) {
            int snowballSnow = scanner.nextInt();
            int snowballTime = scanner.nextInt();
            int snowballQuality = scanner.nextInt();
            long snowballValue = (long) Math.pow((snowballSnow / snowballTime),snowballQuality);
            if (snowballValue > bestSnowball[2]){
                bestSnowball[0] = snowballSnow;
                bestSnowball[1] = snowballTime;
                bestSnowball[2] = snowballValue;
                bestSnowball[3] = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)",bestSnowball[0],bestSnowball[1],bestSnowball[2],bestSnowball[3]);
    }
}
