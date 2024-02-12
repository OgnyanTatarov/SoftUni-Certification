package ListLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        inputList = inputList.stream().filter(x -> x >= 0).collect(Collectors.toList());
        Collections.reverse(inputList);
        if (!inputList.isEmpty()) System.out.println(inputList.toString().replaceAll("[\\[\\],]",""));
        else System.out.println("empty");
    }
}
