package DataTypesExer;

import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        for (int i = 0; i < end ; i++) {
            char firstChar = (char)('a'+i);
            for (int j = 0; j < end ; j++) {
                char secondChar = (char) ('a'+j);
                for (int k = 0; k < end ; k++) {
                    char thirdChar = (char)('a'+k);
                    System.out.printf("%c%c%c\n",firstChar,secondChar,thirdChar);
                }
            }
        }
    }
}
