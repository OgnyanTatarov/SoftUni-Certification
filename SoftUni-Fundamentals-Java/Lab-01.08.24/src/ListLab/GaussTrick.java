package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int listSize = inputList.size();
        for (int i = 0; i < listSize / 2; i++) {
            int newValue = inputList.get(i) + inputList.get(listSize - (i +1));
            inputList.set(i,newValue);
            inputList.remove(listSize - (i +1));
        }

        System.out.println(inputList.toString().replaceAll("[\\[\\],]",""));

    }
}
