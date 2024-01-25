package ArrayLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayWeek = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Invalid day!"};
        int input = scanner.nextInt();
        if (input <= dayWeek.length - 1 && input > 0) System.out.println(dayWeek[input - 1]);
        else System.out.println(dayWeek[7]);
    }
}
