package ListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] targetNumber = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


            while(inputList.contains(targetNumber[0]))
            {
                int i = inputList.indexOf(targetNumber[0]);

                if (i - targetNumber[1] < 0) {
                    inputList.subList(0,i + targetNumber[1]+1).clear();
                }else if(i + targetNumber[1] >= inputList.size()){
                    inputList.subList(i - targetNumber[1],inputList.size()).clear();
                }else{
                    inputList.subList(i - targetNumber[1], i + targetNumber[1] + 1).clear();
                }

            }


        System.out.println(inputList.stream().reduce(0,(a,b) -> a + b ));
    }
}
