package Lab;

import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        minutes+=30;
        if(minutes > 60){
            minutes -=60;
            hour+=1;
            if (hour == 24)hour=0;
        }

        System.out.printf("%d:%02d",hour ,minutes);
    }
}
