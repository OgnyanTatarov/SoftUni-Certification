package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> outputList = new ArrayList<>();

        int lengHtFirst = inputList.size();
        int lenghtSecond = secondList.size();
        while(Math.min(lenghtSecond,lengHtFirst) > 0){
            int firstElement = inputList.get(0);
            int secondElement = secondList.get(0);
            outputList.add(firstElement);
            outputList.add(secondElement);
            inputList.remove(0);
            secondList.remove(0);
            lenghtSecond--;
            lengHtFirst--;
        }

        if (lenghtSecond > 0){
            outputList.addAll(secondList);
        } else{
            outputList.addAll(inputList);
        }
        System.out.println(outputList.toString().replaceAll("[\\[\\],]",""));

    }
}
