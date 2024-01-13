package MoreExercises;

import java.util.Hashtable;
import java.util.Scanner;

public class Messages {
    public static int getCountDigits(int number){
        int count = 0;
        while (number > 0){
            count++;
            number /= 10;
        }
        if (count == 0) return 0;
        else return count-1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer,Character[]> keyboard = new Hashtable<>(){
            {
                put(0,new Character[]{' '});
                put(2,new Character[]{'a','b','c'});
                put(3,new Character[]{'d','e','f'});
                put(4,new Character[]{'g','h','i'});
                put(5,new Character[]{'j','k','l'});
                put(6,new Character[]{'m','n','o'});
                put(7,new Character[]{'p','q','r','s'});
                put(8,new Character[]{'t','u','v'});
                put(9,new Character[]{'w','x','y','z'});
            }
        };
        String output = "";
        int n = Integer.parseInt(scanner.nextLine());
        String input = "";
        while(n > 0){
            input = scanner.nextLine();
            int number = Integer.parseInt(input);
            int digit = number % 10;
            int countDigits = getCountDigits(number);
            Character[] letters = keyboard.get(digit);
            output += letters[countDigits];
            n--;

        }
        System.out.println(output);

    }
}
