package MethodsMoreExercises;

import java.util.HashMap;
import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        HashMap<Long,Long> memoazation = new HashMap<Long,Long>();
        if (num >= 4){
            System.out.printf("1 1 2 ");
            findTribonnacci(num,memoazation);
        }else if (num == 3){
            System.out.printf("1 1 2");
        }else if(num == 2) System.out.printf("1 1");
        else System.out.printf("1");
    }

    private static long findTribonnacci(long num, HashMap<Long,Long>memoazation) {
        if (memoazation.containsKey(num))return memoazation.get(num);
        if (num == 1 || num == 2)return 1;
        if (num == 3)return 2;
        long number = findTribonnacci(num-1,memoazation)+findTribonnacci(num-2,memoazation)+findTribonnacci(num-3,memoazation);
        memoazation.put(num,number);
        System.out.printf("%d ",number);
        return number;
    }
}
