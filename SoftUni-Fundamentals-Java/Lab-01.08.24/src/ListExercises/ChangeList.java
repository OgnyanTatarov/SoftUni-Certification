package ListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commands = scanner.nextLine().split(" ");
        while(!commands[0].equals("end"))
        {
            if (commands[0].equals("Delete")){
                int targetNumber = Integer.parseInt(commands[1]);
                inputList.removeIf(x -> x == targetNumber);
            }else{
                int targetNumber = Integer.parseInt(commands[1]);
                int targetIndex = Integer.parseInt(commands[2]);
                inputList.add(targetIndex,targetNumber);
            }
            commands = scanner.nextLine().split(" ");
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]",""));

    }
}
