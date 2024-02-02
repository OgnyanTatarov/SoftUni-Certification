package ArrayMoreExercises;

import java.util.Hashtable;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Hashtable<Long,Long> memoization = new Hashtable<>();
        System.out.println(getFibonacci(n,memoization));
    }
    public static Long getFibonacci(Long n,Hashtable<Long,Long> memoization)
    {
        if (n == 1 || n == 2)return 1L;
        if (memoization.containsKey(n))return memoization.get(n);
        memoization.put(n,getFibonacci(n-1,memoization)+getFibonacci(n-2,memoization));
        return memoization.get(n);
    }
}
